

//Bubble sort optimize 

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
        boolean swapped;
        //run the steps n-1 times
       for(int i=0; i<arr.length; i++)
        {   
            swapped = false;
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
                   swapped = true;
               }
           }
           
           // if you did not swap for a particular value of i,it means the array is sorted hence stop the program
           if(swapped==false)
           {
               break;
           }
       }


        
   }
}