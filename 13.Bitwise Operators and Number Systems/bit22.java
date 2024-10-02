//Find X-OR from all numbers from 0 to n

import java.util.*;
public class bit22{

        public static void main(String[] args)
          {
                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();
                System.out.println(ans(n));
          }
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
