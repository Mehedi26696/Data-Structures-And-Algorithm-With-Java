
//Print the fibonacci sequence till nth term.

import java.util.*;
public class rec4{
        
        public static void fibo(int a,int b,int n)
        {
            if(n==0)
            {
                return;
            }

            System.out.print(a+" ");

            fibo(b,a+b,n-1);
        }

        public static void main(String[] args)
          {
                Scanner sc = new Scanner(System.in);

                int n = sc.nextInt();

                fibo(0,1,n);
                System.out.println();
          }
}

 