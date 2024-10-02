
//Find all Numbers Disappeared in an Array

//https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/description/


//Given an array nums of n integers where nums[i] is in the range [1, n], return an array of all the integers in the range [1, n] that do not appear in nums.


//Input: nums = [4,3,2,7,8,2,3,1]  Output: [5,6]

//Input: nums = [1,1]  Output: [2]

//Input: nums = [1,2]  Output: []



import java.util.*;
public class sort7{

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

       System.out.println(disappeared(arr));
    
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

    public static ArrayList<Integer> disappeared(int []arr)
    {    
        ArrayList<Integer> list = new ArrayList<>();
        boolean check = false;
         for(int i =0;i<arr.length;i++)
        {
            if(arr[i]!=(i+1))
            {
                 list.add(i+1);
                 check = true;
            }
        } 
        
        if(check)
        {
            return list;
        }

        else
        {
             

            return list;
        }

         
    }
}