//Find the sum of nTh row in pascal triangle
//We know sum of each row = nc0+nc1+nc2+.......ncn=2^n
//For nth row sum = 2^n-1 (power start from 0)
// 2^n-1 == 1<<(n-1)

import java.util.*;
public class bit18{

        public static void main(String[] args)
          {
                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();
                System.out.println(1<<(n-1));
          }
}
