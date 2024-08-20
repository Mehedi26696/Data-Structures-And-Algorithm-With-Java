
//Print the sum of first n natural numbers.

import java.util.*;
public class rec2{
        
        public static int summation(int n,int sum)

        {
            //base case

            if(n==0)
            {
                return sum;
            }
            
            sum=sum+n;
            return summation(n-1,sum);

        }

        public static void main(String[] args)
          {
                Scanner sc = new Scanner(System.in);

                int n = sc.nextInt();

                int sum =0;
                System.out.println(summation(n,sum));
          }
}
