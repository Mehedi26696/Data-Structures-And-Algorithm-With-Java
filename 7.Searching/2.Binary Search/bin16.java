

//Split Array Largest Sum

//https://leetcode.com/problems/split-array-largest-sum/description/

//Input: nums = [7,2,5,10,8], k = 2 Output: 18

//Explanation: There are four ways to split nums into two subarrays.
//The best way is to split it into [7,2,5] and [10,8], where the largest sum among the two subarrays is only 18.


import java.util.*;
public class bin16{


        public static void main(String[] args)
          {
                Scanner sc = new Scanner(System.in);
                
                int size = sc.nextInt();
                int[] arr = new int[size];
                for(int i=0;i<arr.length;i++)
                {
                    arr[i] = sc.nextInt();
                } 

                int key = sc.nextInt(); 

                System.out.println(splitArray(arr,key));                    
          }

        public static int splitArray(int[] arr,int k)
        {
            int s = 0;
            int e = 0;
            for(int i=0;i<arr.length;i++)
            {   
                s = Math.max(s,arr[i]); //in the end of the loop this will contain the max element of the array

                e+=arr[i];
            }

            //apply binary search

            int mid = s+(e-s)/2;
            while(s<e)
            {
                

                //calculate how many pieces we can devide this in with this max sum

                int sum = 0;
                int pieces = 1;
                for(int num : arr)
                {
                    if(sum+num>mid)
                    {
                        //we can not add this in subarray, make new one

                        //say we add this in new subarray,then sum = num;

                        sum=num;
                        pieces++;
                    }

                    else{
                        sum+=num;
                    }
                }

                if(pieces>k)
                {
                    s = mid+1;
                }
                else{
                    e =mid;
                }

                //try for the middle as potential answer

                mid = (s+e)/2;
                
            }

            return s; //or return e;
        }
}