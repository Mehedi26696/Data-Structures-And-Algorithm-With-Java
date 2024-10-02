//2D arrays
//rows-> arr.length
//cols-> arr[i].length

import java.util.*;
public class arr5{

        public static void main(String[] args)
          {
                Scanner sc = new Scanner(System.in);

                int rows = sc.nextInt();
                int cols = sc.nextInt();
               
                int num[][] = new int[rows][cols];
                //int[][] num = new int[rows][cols];
                for(int i =0;i<rows;i++)
                {
                    for(int j=0;j<cols;j++)
                    {
                        num[i][j] = sc.nextInt();
                    }
                }
                 

                //first way
                // for(int i =0;i<rows;i++)
                // {
                //     for(int j=0;j<cols;j++)
                //     {
                //         System.out.print(num[i][j]+" ");
                //     }
                //     System.out.println();
                // }


                
                //2nd way
                //  for(int i =0;i<num.length;i++)
                // {
                //     for(int j=0;j<num[i].length;j++)
                //     {
                //         System.out.print(num[i][j]+" ");
                //     }
                //     System.out.println();
                // }

                //3rd way

                //  for(int i =0;i<num.length;i++)
                // {
                //     System.out.println(Arrays.toString(num[i]));
                   
                // }

                //4th way

                // for(int[] a : num)
                // {
                //     System.out.println(Arrays.toString(a));
                // }




                
          }
}
