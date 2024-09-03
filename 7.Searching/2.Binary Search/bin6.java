
//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/
//Find First and Last Position of Element in Sorted Array
//Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.

//If target is not found in the array, return [-1, -1].


//bruteforce solution

import java.util.*;
public class bin6{

        public static void main(String[] args)
          {
                Scanner sc = new Scanner(System.in);
                int size = sc.nextInt();
                int[] arr = new int[size];
                for(int i =0;i<arr.length;i++)
                {
                    arr[i] = sc.nextInt();
                }
                
                int target = sc.nextInt();

                System.out.println(Arrays.toString(search(arr,target)));
          }

        public static int[] search(int[] arr,int target)
        {
           
             int f = 0;

             int[] ans = {-1,-1};
             
             for(int i=0;i<arr.length;i++)
             {
                if(arr[i]==target && f==0)
                {
                  
                  ans[0] = i;
                  f=1;
                  ans[1] =i;
                }

                if(arr[i] == target && f==1)
                {
                   ans[1] =i;
                }
             }

             return ans;
        }
}
