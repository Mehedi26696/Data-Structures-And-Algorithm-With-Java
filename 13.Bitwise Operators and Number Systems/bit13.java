//Find the position of the right most set bit(1)

import java.util.*;
public class bit13{

        public static void main(String[] args)
          {
                Scanner sc = new Scanner(System.in);

                int n = sc.nextInt();
                System.out.println(n & -n);
          }
}
