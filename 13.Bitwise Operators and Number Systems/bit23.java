//Find X-OR of all numbers from a to b
// ans will be (x-or from 0 to b )^(x-or from 0 to a-1)

import java.util.*;
public class bit23{

        public static void main(String[] args)
          {
                Scanner sc = new Scanner(System.in);
                int a = sc.nextInt();
                int b = sc.nextInt();
                System.out.println(ans(b)^ans(a-1));
          }

        //this will give x-or from 0 to n
        public static int ans(int n)
        {
            if(n%4 == 0){
                return n;
            }
            if(n%4 == 1){
                return 1;
            }
            if(n%4 == 2){
                return n+1;
            }
            //(n%4 == 3)
            else{
                return 0;
            }
        }
}
