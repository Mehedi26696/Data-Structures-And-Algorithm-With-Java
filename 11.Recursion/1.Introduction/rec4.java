
//FInd nth fibonachi numbers

import java.util.*;
public class rec4{

        public static void main(String[] args)
          {
                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();
                System.out.println(fibonachi(n));
          }

        public static int fibonachi(int n)
        {
            //base condition
            if(n<2)
            {
                return n;
            }
            
            
            return fibonachi(n-1)+fibonachi(n-2);
        }
}
