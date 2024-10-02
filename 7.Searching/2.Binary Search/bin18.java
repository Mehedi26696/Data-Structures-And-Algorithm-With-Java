
//Binary search in 2D arrays


//sorted 2D array
// 1 2 3 4
// 5 6 7 8 
// 9 10 11 12 
// 13 14 15 16



import java.util.*;
public class bin18{

        public static void main(String[] args)
          {
                Scanner sc = new Scanner(System.in);
                int rows = sc.nextInt();
                int cols = sc.nextInt();

                int[][] arr = new int[rows][cols];
                for(int i=0;i<rows;i++)
                {
                    for(int j=0;j<cols;j++)
                    {
                        arr[i][j] = sc.nextInt();
                    }
                }
                int target = sc.nextInt();

                System.out.println(Arrays.toString(search(arr,target)));
          }

          public static int[] search(int[][]arr ,int target)
          {
               int rows = arr.length;
               int cols = arr[0].length;

               if(rows == 1)
               {
                return binarysearch(arr,0,0,cols-1,target);
               }

               //perform binary search in middle column
               //run the loop till 2 rows are remaining

               //we are eliminating rows it can be done by eliminating columns

               int rStart =0;
               int rEnd = rows-1;

               int cMid = cols/2;

               while(rStart<(rEnd-1)) //while this true it means there have more than 2 rows
               {
                  int mid = rStart+(rEnd-rStart)/2;

                  if(arr[mid][cMid] == target)
                  {
                    return new int[]{mid,cMid};
                  }
                  if(arr[mid][cMid] <target)
                  {
                     //ignore above rows

                     rStart = mid;
                  }
                  else
                  {
                    rEnd = mid;
                  }
               }

               //now we have two rows
               //check whether the target is in the col of 2 rows

               if(arr[rStart][cMid] == target)
               {
                  return new int[]{rStart,cMid};
               }

               if(arr[rStart+1][cMid] == target)
               {
                  return new int[]{rStart+1,cMid};
               }

               //search in 1st half

               if(target <= arr[rStart][cMid-1])
               {
                    return binarysearch(arr,rStart,0,cMid-1,target);
               }
               
               //search in 2nd half

               if(target >= arr[rStart][cMid+1] && target <= arr[rStart][cols-1])
               {
                   return binarysearch(arr,rStart,cMid+1,cols-1,target);
               }
               
               //search in 3rd half

               
               if(target <= arr[rStart+1][cMid-1])
               {
                  return binarysearch(arr,rStart=1,0,cMid-1,target);
               }
               //search in 4th half
               
               
               //if(target >= arr[rStart+1][cMid+1])
               else
               {
                   return binarysearch(arr,rStart+1,cMid+1,cols-1,target);
               }
              


          }
        

        //binary search in the row with specific range (between the columns proided)
        public static int[] binarysearch(int[][] arr,int row,int cStart,int cEnd,int target)
        {   
             int mid = cStart+(cEnd-cStart)/2;

             while(cStart<=cEnd)
             {
                if(arr[row][mid] == target)

                {
                    return new int[]{row,mid};
                }

                if(arr[row][mid]<target)
                {
                    cStart = mid+1;
                }
                else{
                    cEnd = mid-1;
                }

                mid = (cEnd+cStart)/2;
             }

             return new int[]{-1,-1};

        }


}
