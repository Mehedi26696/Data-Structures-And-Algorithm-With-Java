//Find the no. of set bits in a given number

import java.util.*;
public class bit21{

        public static void main(String[] args)
          {
                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();
                int ans =0;

                //one way

                // while(n>0){
                //     ans++;
                //     n-=(n&-n);
                // }

                //another way
                while(n>0){
                    ans++;
                    n = n & (n-1);
                }
                System.out.println(ans);
          }
}
