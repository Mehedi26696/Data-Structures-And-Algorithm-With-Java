// Right shift operator (>>)

// a>>1 = a/2
// a>>b = a/(2^b)

import java.util.*;
public class bit6{

        public static void main(String[] args)
          {
                Scanner sc = new Scanner(System.in);
                int a = sc.nextInt();
                int b = sc.nextInt();
                System.out.println(a>>b);
          }
}