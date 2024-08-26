
//Dynamic arrays
//columns size is not fixed

import java.util.*;
public class arr10{

        public static void main(String[] args)
          {
                Scanner sc = new Scanner(System.in);

                int arr[][] ={
                    {1,2,3,4},
                    {5,6},
                    {7,8,9}
                };
                for(int i =0;i<arr.length;i++)
                {
                    for(int j=0;j<arr[i].length;j++){
                        System.out.print(arr[i][j]+" ");
                    }
                    System.out.println();
                }
          }
}
