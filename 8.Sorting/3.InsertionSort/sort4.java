
//insertion sort
//Time complexity-> Worst cse-> O(n^2)
//Best Case -> O(n)


//use because step get reduce if array is sorted. No. of swap reduced as compared to bubble sort
//It's stable
//use for smaller values of n. works good as when the array is partially sort
//use it for hybrid sort


import java.util.*;
class sort4{
   public static void main(String args[]) 
   {

       Scanner sc = new Scanner(System.in);

       int size = sc.nextInt();
       
       int arr[] = new int[size];

       for(int i =0;i<size;i++)
       {
           arr[i] = sc.nextInt();
       }

       insertionsort(arr);

       System.out.println(Arrays.toString(arr));
   }

    //insertion sort

    //for index put that index element at the correct postion of left hand side
    
    public static void insertionsort(int[] arr)
    {

       for(int i=1; i<arr.length-1; i++) 
       {
            for(int j = i+1;j>0;j--)
            {
                if(arr[j]<arr[j-1])
                {
                    //swap

                    int temp =arr[j];
                    arr [j] = arr[j-1];
                    arr[j-1] = temp;
                }
                else
                {
                    break;
                }
            }
        
       }
   }
}