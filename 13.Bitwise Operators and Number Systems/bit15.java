//Find the nth magic number
//Magic number is convert binary number to decimal using 5 instead of 2

//(n&1) gives us last bit in binary digit
//n>>1 help us to move next bit by removing previous last bit

import java.util.*;
public class bit15{

        public static void main(String[] args)
          {
                Scanner sc = new Scanner(System.in);
                 int n = sc.nextInt();
                 int ans = 0;
                 int p = 1;
                 while(n>0){
                    //System.out.println(n&1);
                    ans+=Math.pow(5,p)*(n&1);
                    //System.out.println(ans);
                    n= n>>1;
                    p++;
                 }

                System.out.println(ans);
          }
}
