
//Selection Sort

import java.util.*;
class sort2{
   public static void printArray(int arr[]) {
       for(int i=0; i<arr.length; i++) {
           System.out.print(arr[i]+" ");
       }
       System.out.println();
   }


   public static void main(String args[]) {

       Scanner sc = new Scanner(System.in);

       int size = sc.nextInt();
       
       int arr[] = new int[size];

       for(int i =0;i<size;i++)
       {
           arr[i] = sc.nextInt();
       }
               

       //selection sort
       for(int i=0; i<arr.length-1; i++) {
           int smallest = i;
           for(int j=i+1; j<arr.length; j++) {
               if(arr[j] < arr[smallest]) {
                   smallest = j;
               }
           }
           //swap
           int temp = arr[smallest];
           arr[smallest] = arr[i];
           arr[i] = temp;
       }


       printArray(arr);
   }
}