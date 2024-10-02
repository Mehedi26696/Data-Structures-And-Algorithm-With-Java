//Find no of digit in base b of no N
//Formula -> (int)(logn base b)+1

import java.util.*;
public class bit17{

        public static void main(String[] args)
          {
                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();
                int b = sc.nextInt();
                int ans = (int)(Math.log(n)/Math.log(b))+1;
                System.out.println(ans);
          }
}
