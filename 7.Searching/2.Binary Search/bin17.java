

//Binary search in 2D arrays

// matrix is sorted in a rowwise and columnswise sorted

//  10 20 30 40
//  15 25 35 45
//  28 39 37 49
//  33 34 38 50

import java.util.*;
public class bin17{

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
              int r = 0;
              int c = arr.length-1;
              while(r<arr.length && c>=0)
              {
                if(arr[r][c] == target)
                {
                    return new int[]{r,c};
                }

                if(arr[r][c]<target)
                {
                    r++;
                }
                else
                {
                    c--;
                }
              }

              return new int[]{-1,-1};

          }


}
