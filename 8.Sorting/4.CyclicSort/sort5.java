
//cyclic sort

//It's pattern when elements of array is from range 1 to N. like [3,5,2,1,4] we use cyclic sort

//Time complexity- Worst case-O(n)


import java.util.*;
public class sort5{

   public static void main(String args[]) 
   {

       Scanner sc = new Scanner(System.in);

       int size = sc.nextInt();
       
       int arr[] = new int[size];

       for(int i =0;i<size;i++)
       {
           arr[i] = sc.nextInt();
       }
        cyclicsort(arr);
       System.out.println(Arrays.toString(arr));
    
   }
    public static void cyclicsort(int[] arr)
    {
       
       int i =0;
       while(i<arr.length)
       {
           int correct = arr[i]-1;
           if(arr[i] != arr[correct])
           {
               int temp = arr[i];
               arr[i] = arr[correct];
               arr[correct] = temp;
           }
           else
           {
              i++;
           }
       }

    }
}

