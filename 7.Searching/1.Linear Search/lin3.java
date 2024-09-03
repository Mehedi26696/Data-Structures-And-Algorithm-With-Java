
//search in 2D arrays

import java.util.*;
public class lin3{

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

                //System.out.println(search(arr,target));

                int [] ans = search(arr,target);
            
                System.out.println(Arrays.toString(ans));
          }

        // public static boolean search(int[][] arr,int target)
        // {
        //     for(int i =0;i<arr.length;i++)
        //     {
        //         for(int j=0;j<arr[i].length;j++)
        //         {
        //             if(arr[i][j]==target)
        //             {
        //                 return true;
        //             }
        //         }
        //     }

        //     return false;
        // }



        //return array 

        // public static int[] search(int[][] arr,int target)
        // {   
        //     int[] ans ={-1,-1};
        //     for(int i =0;i<arr.length;i++)
        //     {
        //         for(int j=0;j<arr[i].length;j++)
        //         {
        //             if(arr[i][j]==target)
        //             {   
        //                 ans[0] =i;
        //                 ans[1] = j;
        //                 return ans;
        //             }
        //         }
        //     }

        //     return ans;
        // }


        //return array(better way)

        public static int[] search(int[][] arr,int target)
        {   
             
            for(int i =0;i<arr.length;i++)
            {
                for(int j=0;j<arr[i].length;j++)
                {
                    if(arr[i][j]==target)
                    {   
                         
                        return new int[]{i,j};
                    }
                }
            }

            return new int[]{-1,-1};
        }
}
