
////Find the Rotation Count in Rotated Sorted array(duplicate elements can be there)


import java.util.*;
public class bin15{


        public static void main(String[] args)
          {
                Scanner sc = new Scanner(System.in);
                
                int size = sc.nextInt();
                int[] arr = new int[size];
                for(int i=0;i<arr.length;i++)
                {
                    arr[i] = sc.nextInt();
                } 

                System.out.println(countrotations(arr));                       
          }

        public static int countrotations(int[] arr)
        {
            int pivot =  findPivot(arr);
            
            //if we did not find a pivot, that means the array is not rotated

            if(pivot == -1)
            {
                //array is not sorted

                return 0;
            }

            //if pivot is found, it means array is rotated

            return pivot+1;
        
        }
        
        public static int findPivot(int[] arr)
        {   
            int s =0;
            int e = arr.length-1;
            
            int mid =s+(e-s)/2;
            while(s<=e)
            {
                 
                 //4 cases 
                 if(mid < e && arr[mid]>arr[mid+1])
                 {   
                    //if in some cases mid is the last element of this array then mid+1 gives error that's why we make a check 
                    //when we find  arr[mid]>arr[mid+1] this is pivot cause two part of of the array is sorted in ascending orde
                     return mid;
                 }
                 if( mid > s && arr[mid]<arr[mid-1])
                 {   
                    //if in some cases mid is the first element of this array then mid-1 gives error that's why we make a check 
                    //also when we find  arr[mid]<arr[mid-1] this is pivot cause two part of of the array is sorted in ascending order
                    return mid-1;
                 }
                //this  wil not work in duplicate elements cases
                //  if(arr[mid]<=arr[s]) 
                //  {  
                     
                //     e = mid-1;
                     
                //  }
                //  else 
                //  {
                //     s = mid+1;
                //  }

                //if elements at middle,start,end are equal then just skip duplicates

                if(arr[mid] == arr[s] && arr[mid] == arr[e])
                {
                    //skip duplicates

                    //note: what if these elements at start and end were pivot


                    //check if start is pivot

                    if(arr[s]>arr[s+1])
                    {
                        return s;
                    }

                    s++;

                    //check whether end is pivot

                    if(arr[e]<arr[e-1])
                    {
                        return e-1;
                    }
                    e--;
                }

                else if(arr[s] <arr[mid] || (arr[s] == arr[mid] && arr[mid]>arr[e]))
                {
                    s=mid+1;
                }
                else{
                    e = mid-1;
                }


                 //mid update
                 mid =(s+e)/2;
            }
            return -1 ;  

        }

       
        
}