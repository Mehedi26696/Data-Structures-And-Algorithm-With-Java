
//Find the nth magic number
//Magic number is convert binary number to decimal using 5 instead of 2

//(n&1) gives us last bit in binary digit
//n>>1 help us to move next bit by removing previous last bit

import java.util.*;
public class bit16{

        public static void main(String[] args)
          {
                Scanner sc = new Scanner(System.in);
                 int n = sc.nextInt();
                 int ans = 0;
                 int base = 5;
                 while(n>0){
                    //System.out.println(n&1);
                    int last = n&1;
                    //System.out.println(ans);
                    n= n>>1;
                    ans+=last*base;
                    base = base*5;
                    
                 }

                System.out.println(ans);
          }
}
