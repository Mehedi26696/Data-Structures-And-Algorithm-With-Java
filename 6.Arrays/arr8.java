
//toString() method

import java.util.*;
public class arr8{

        public static void main(String[] args)
          {
                Scanner sc = new Scanner(System.in);
                int size = sc.nextInt();
                int[] arr = new int[size];
                for(int i=0;i<arr.length;i++)
                {
                    arr[i] = sc.nextInt();
                }
                // for(int i=0;i<arr.length;i++)
                // {
                //      System.out.print(arr[i]+" ");
                // }

                //for each

                System.out.println(Arrays.toString(arr));
                
          }
}