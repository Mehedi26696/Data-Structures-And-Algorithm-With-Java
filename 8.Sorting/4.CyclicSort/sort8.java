
//Find the Duplicate Number

//https://leetcode.com/problems/find-the-duplicate-number/

//Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.

//There is only one repeated number in nums, return this repeated number.


//Input: nums = [1,3,4,2,2] Output: 2




import java.util.*;
public class sort8{

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
       //System.out.println(Arrays.toString(arr));

       System.out.println(duplicate(arr));
    
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

    public static int duplicate(int []arr)

    {    
         for(int j=0;j<arr.length;j++)
         {
             if(arr[j] !=(j+1))
             {
                return arr[j];
             }
         }

         return -1;

         
    }
}