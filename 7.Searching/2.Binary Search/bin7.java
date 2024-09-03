

//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/
//Find First and Last Position of Element in Sorted Array
//Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.

//If target is not found in the array, return [-1, -1].


//optimal solution(binary search)



import java.util.*;
public class bin7{

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
           
             int[] ans ={-1,-1};
             //check for first occurence

              int start = binarysearch(arr,target,true);
              int last = binarysearch(arr,target,false);

              ans[0] =start;
              ans[1] = last;

             return ans;
        }

       //this function just returns the index value of target by binary search
        public static int binarysearch(int[] arr,int target,boolean findstartindex)
        {   
            int ans =-1;
            int s = 0;
            int e = arr.length-1;
            int mid =s+(e-s)/2;
            while(s<=e)
            {
                 
                 if(target >arr[mid])
                 {  
                    
                     s=mid+1;
                 } 
              
                 else if(target<arr[mid])
                 {
                    e=mid-1;
                 }
                 else{
                     //potential ans found
                     ans = mid;
                     if(findstartindex)
                     {
                        e = mid-1;
                     }
                     else
                     {
                        s = mid+1;
                     }
                 }
                 //mid update
                 mid =(s+e)/2;
            }
 
            return ans;

        }
}