

//for each loop

import java.util.*;
public class arr7{

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

                 

                for(int num : arr)  //for every element in array,print the element
                {
                    System.out.print(num+" "); //here num represents element of the array
                }
                
          }
}
