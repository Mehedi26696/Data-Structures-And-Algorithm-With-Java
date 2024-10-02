//Missing Number
//https://leetcode.com/problems/missing-number/description/

//Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.


//Input: nums = [3,0,1]  Output: 2

//Input: nums =[1,0,3,2]  Output = 4

//so no need to minus 1;

import java.util.*;
public class sort6{

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

       System.out.println(search(arr));
        
    
   }
    public static void cyclicsort(int[] arr)
    {   

       int i =0;
       while(i<arr.length)
       {
           int correct = arr[i];
           if(arr[i]<arr.length && arr[i] != arr[correct])
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

    public static int search(int[] arr)
    {
        for(int i =0;i<arr.length;i++)
        {
            if(arr[i]!=i)
            {
                return i;
            }
        } 
        //case 2

        return arr.length;
         
    }
}