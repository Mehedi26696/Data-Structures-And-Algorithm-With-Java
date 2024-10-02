//Flipping Image

//https://leetcode.com/problems/flipping-an-image/description/
// Given an n x n binary matrix image, flip the image horizontally, then invert it, and return the resulting image.

// To flip an image horizontally means that each row of the image is reversed.

// For example, flipping [1,1,0] horizontally results in [0,1,1].
// To invert an image means that each 0 is replaced by 1, and each 1 is replaced by 0.

// For example, inverting [0,1,1] results in [1,0,0].

import java.util.*;
public class bit24{

        public static void main(String[] args)
          {
                Scanner sc = new Scanner(System.in);
                 int n = sc.nextInt();
                 int[][] arr = new int[n][n];
                for(int i=0;i<n;i++){
                    for(int j=0;j<n;j++){

                        arr[i][j] = sc.nextInt();
                    
                    }
                }
                for(int[] row : arr){
                    //reverse the row
                    for(int i=0;i<((arr[0].length+1)/2);i++){
                        //swap and flipp
                        int temp = row[i]^1;
                        row[i] =row[arr[0].length-i-1]^1;
                        row[arr[0].length-i-1] = temp;

                    }
                }

                 for(int i=0;i<n;i++){
                     System.out.println(Arrays.toString(arr[i]));
                }
                
          }
}
