


//Linear Search
//Find an elements in array
//Time complexity for Linear Search: Best Case-> O(1) when the first elements is target
//and Worst Case->O(N) , N is the size of array

import java.util.*;
public class lin1{

        public static void main(String[] args)
          {
                Scanner sc = new Scanner(System.in);
                int size = sc.nextInt();
                int[] arr = new int[size];
                for(int i =0;i<arr.length;i++)
                {
                    arr[i] = sc.nextInt();
                }

                int elements = sc.nextInt();
                int index=-1;
                for(int i =0;i<arr.length;i++)
                {
                    if(arr[i]==elements)
                    {
                        index =i;
                    }
                }

                System.out.println("Find at index : "+index);
          }
}
