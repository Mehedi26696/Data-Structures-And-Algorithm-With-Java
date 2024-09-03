
//Given an integer array nums of length n, you want to create an array ans of length 2n where ans[i] == nums[i] and ans[i + n] == nums[i] for 0 <= i < n (0-indexed).


import java.util.*;
public class arr14{

        public static void main(String[] args)
          {
                Scanner sc = new Scanner(System.in);
                
                int size = sc.nextInt();
                int[] nums = new int[size];

                for(int i=0;i<nums.length;i++)
                {
                    nums[i] = sc.nextInt();
                }

                int [] ans = new int[2*nums.length];

                for(int i = 0;i<nums.length;i++)
                {
                    ans[i] = nums[i];
                }

                for(int i = nums.length;i<ans.length;i++)
                {
                    ans[i] = nums[i-nums.length];
                }
            

                for(int i = 0;i<ans.length;i++)
                {
                     System.out.print(ans[i]+" ");
                }
               
          }
}
