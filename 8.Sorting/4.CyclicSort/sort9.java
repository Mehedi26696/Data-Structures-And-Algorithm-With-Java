
//Find All Duplicates in an Array

//https://leetcode.com/problems/find-all-duplicates-in-an-array/description/

//Given an integer array nums of length n where all the integers of nums are in the range [1, n] and 
//each integer appears once or twice, return an array of all the integers that appears twice.

//Input: nums = [4,3,2,7,8,2,3,1] Output: [2,3]

import java.util.*;
public class sort9{

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

       System.out.println(allduplicate(arr));
    
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

    public static  ArrayList<Integer> allduplicate(int []arr)

    {    
        ArrayList<Integer> list = new ArrayList<>();
         
         for(int j=0;j<arr.length;j++)
         {
             if(arr[j] !=(j+1))
             {
                 list.add(arr[j]);
                  
             }
         }
         
         return list;

         
    }
}