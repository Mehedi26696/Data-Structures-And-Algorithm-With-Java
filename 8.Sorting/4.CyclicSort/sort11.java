

//First missing positive

//https://leetcode.com/problems/first-missing-positive/description/

//Given an unsorted integer array nums. Return the smallest positive integer that is not present in nums.


//Input: nums = [1,2,0] Output: 3

//Input: nums = [7,8,9,11,12] Output: 1


import java.util.*;
public class sort11{

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

       System.out.println(firstMissingPositive(arr));
    
   }
    public static void cyclicsort(int[] arr)
    {
       
       int i =0;
       while(i<arr.length)
       {
           int correct = arr[i]-1;
           //igonre negative
           if(arr[i]>0 && arr[i]<arr.length &&  arr[i] != arr[correct])
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

    public static int firstMissingPositive(int []arr)

    {    
         
         
         for(int j=1;j<arr.length;j++)
         {   
 
             if(arr[j] !=j+1)
             {
                  return j+1; 
                  
             }
         }
         
         return arr.length+1;

         
    }
}

