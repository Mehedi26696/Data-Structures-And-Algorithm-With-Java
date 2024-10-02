
// Set Mismatch
//You have a set of integers s, which originally contains all the numbers from 1 to n. Unfortunately, due to some error, one of the 
//numbers in s got duplicated to another number in the set, which results in repetition of one number and loss of another number.

//Find the number that occurs twice and the number that is missing and return them in the form of an array.


//https://leetcode.com/problems/set-mismatch/description/

// Input: nums = [1,2,2,4]  Output: [2,3]

import java.util.*;
public class sort10{

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

       System.out.println(Arrays.toString(setmismatch(arr)));
    
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

    public static int[] setmismatch(int []arr)

    {    
         
         
         for(int j=0;j<arr.length;j++)
         {
             if(arr[j] !=(j+1))
             {
                  return new int[]{arr[j],(j+1)};
                  
             }
         }
         
         return new int[]{};

         
    }
}

