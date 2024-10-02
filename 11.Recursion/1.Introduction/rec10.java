
//product of digits

import java.util.*;
public class rec10{

        public static void main(String[] args)
          {
                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();
                
                System.out.println(productofdigits(n));
          }
        public static int productofdigits(int n)
        {
            if(n<10){
                return n;
            }
            return (n%10)*productofdigits(n/10);

        }
}