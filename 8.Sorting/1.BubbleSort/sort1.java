
//bubble sort
//also known as sinking sort or exchange sort

//space complexity-> O(1)
//Time complexity-> Best case-> O(n) when array is sorted
//Time complexity-> Worst case-> O(n^2) when array is sorted in reverse order


import java.util.*;


class sort1{
   public static void main(String args[]) 
   {

       Scanner sc = new Scanner(System.in);

       int size = sc.nextInt();
       
       int arr[] = new int[size];

       for(int i =0;i<size;i++)
       {
           arr[i] = sc.nextInt();
       }
        buublesort(arr);
       System.out.println(Arrays.toString(arr));
    
   }
       

       //bubble sort
       //in every step we are comparing adjacent element and moving the largest element at it's sorted position then 2nd largest then 3rd largest and so on

       //bubble sort is unstable algorithm
       //stable algorithm means if the value is the same for two elements,then after sorted the order remain the same

    public static void buublesort(int[] arr)
    {  
        //run the steps n-1 times
       for(int i=0; i<arr.length; i++)
        {
            //for each step, max item will come at the last respective index
           for(int j=1; j<arr.length-i; j++) 
           {   
               //swap if the item is smaller than the previous item
               if(arr[j] < arr[j-1])
                {
                   //swap 
                   int temp = arr[j];
                   arr[j] = arr[j-1];
                   arr[j-1] = temp;
               }
           }
       }


        
   }
}