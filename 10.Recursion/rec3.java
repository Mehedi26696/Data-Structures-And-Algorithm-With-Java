//Print factorial of a number n.

import java.util.*;
public class rec3{
        
        public static int factorial(int n,int fact)
        {
            //base case
            if(n==0 || n==1)
            {
                return fact;
            }

            fact=fact*n;

            return factorial(n-1,fact);
        }

        public static void main(String[] args)
          {
                Scanner sc = new Scanner(System.in);

                int n = sc.nextInt();

                int fact =1;

                System.out.println( factorial(n,fact));
          }
}
