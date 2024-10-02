
//sum of digits

import java.util.*;
public class rec9{

        public static void main(String[] args)
          {
                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();
                
                System.out.println(sumofdigits(n));
          }
        public static int sumofdigits(int n)
        {
            if(n<10){
                return n;
            }
            return (n%10)+sumofdigits(n/10);

        }
}