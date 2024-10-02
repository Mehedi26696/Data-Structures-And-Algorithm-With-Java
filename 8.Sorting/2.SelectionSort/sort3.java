
//Selection Sort
//Time complexity-> Best and worst both case it's O(n^2)
//It's an unstable algorithm

//It performs well in small arrays

import java.util.*;
class sort3{
   
   public static void main(String args[]) 
   {

       Scanner sc = new Scanner(System.in);

       int size = sc.nextInt();
       
       int arr[] = new int[size];

       for(int i =0;i<size;i++)
       {
           arr[i] = sc.nextInt();
       }

       selectionsort(arr);

       System.out.println(Arrays.toString(arr));



   }

   //selection sort
   //select an element and put it's on correct position
            
   public static void selectionsort(int[] arr)
   {
       //n-1 steps are taking
       for(int i=0; i<arr.length; i++) {
        //find minimum in remainig array and swapped with it's correct index
           int smallest = i;
           for(int j=i+1; j<arr.length; j++) {
               if(arr[j] < arr[smallest]) {
                   smallest = j;
               }
           }
           //put it's on it correct position
           int temp = arr[smallest];
           arr[smallest] = arr[i];
           arr[i] = temp;
       }


        
   }
}