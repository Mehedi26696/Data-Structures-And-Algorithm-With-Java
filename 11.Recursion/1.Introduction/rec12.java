
//Reverse a number
// Another way

import java.util.*;
public class rec12{
         
        public static void main(String[] args)
          {
                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();

                int d = numofdigits(n);
                System.out.println(reverse(n,d));
          }
        public static int numofdigits(int n){
            int cnt=0;
            while(n>0){
                cnt++;
                n=n/10;
            }
            return cnt;
        }
        public static int reverse(int n,int d)
        {
            if(n<10){
                return n;
            }
             
            return (n%10)*(int)Math.pow(10,d-1)+reverse(n/10,d-1);

        }
}