//Searching for an element x in a matrix.

import java.util.*;
public class arr6{

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
                int element = sc.nextInt();
                int r=0,c=0;
                boolean flag = false;
                for(int i =0;i<rows;i++)
                {
                    for(int j=0;j<cols;j++)
                    {
                         if(num[i][j]==element)
                         {
                             r = i;
                             c = j;
                             flag = true;
                             break;
                         }
                    }
                     
                }

                if(flag)
                {
                    System.out.println("rows no :"+(r+1));
                    System.out.println("columns no :"+(c+1));
                }
                else
                {
                    System.out.println("Not Found");
                }
          }
}