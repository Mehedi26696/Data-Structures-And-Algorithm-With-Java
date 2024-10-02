
// Number of Steps to Reduce a Number to Zero
//https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/description/

//Given an integer num, return the number of steps to reduce it to zero.

//In one step, if the current number is even, you have to divide it by 2, otherwise, you have to subtract 1 from it.

import java.util.*;
public class rec15{

        public static void main(String[] args)
          {
                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();
                System.out.println(numberOfSteps(n));
          }
        public static int numberOfSteps(int n) 
        {
         return help(n,0);
        
        }

        public static int help(int n,int c)
        {
           if(n==0)
           {
               return c;
           }
           if(n%2==0)
           {
               return help(n/2,c+1);
           }
           else{
               return help(n-1,c+1);
           }
    }
}


