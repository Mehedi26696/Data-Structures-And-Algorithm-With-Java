
//Print numbers from n to 1.

import java.util.*;
public class rec1{
        public static void printNumbers(int n) 
        {
            if(n == 0) 
            {
                return;
            }
            System.out.println(n);//(n to 1)
            printNumbers(n-1);
            //System.out.println(n);//(1 to n)
        }

        public static void main(String[] args)
          {
                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();
 

                printNumbers(n);
          }
}


