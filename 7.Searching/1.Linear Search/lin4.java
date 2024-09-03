

//Given an array nums of integers, return how many of them contain an even number of digits.


import java.util.*;
public class lin4{

        public static void main(String[] args)
          {
                Scanner sc = new Scanner(System.in);
                int size = sc.nextInt();
                int[] arr = new int[size];
                for(int i=0;i<arr.length;i++)
                {
                    arr[i] = sc.nextInt();
                }
                

                System.out.println(evendigits(arr));
          }

          public static int evendigits(int[] nums)
          {
                int cnt = 0;
                for(int i =0;i<nums.length;i++)
                 {   
                      if(even(nums[i]))
                        {
                            cnt++;
                        }
            
                 }
                 return cnt;
          }
          public static boolean even(int num)
          {
                int numdigits = digits(num);
                return numdigits%2==0;
          }

        //   public static int digits(int num)
        //   {
        //       if(num<0)
        //       {
        //          num = num*-1;
        //       }
        //       if(num==0)
        //       {
        //         return 1;
        //       }
        //       int cnt =0;
        //       while(num>0)
        //       {
        //        cnt++;
        //        num=num/10;
        //       }
        //      return cnt;
        //  }

        //optimal way
        //count digits of a number

        public static int digits(int num)
        {   
            if(num<0)
            {
                num = num*-1;
            }
            return (int)(Math.log10(num))+1;
        }
}
