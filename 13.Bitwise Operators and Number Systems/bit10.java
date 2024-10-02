
// Set the ith bit into 1

// For example number is 10110110 and we want to set 4th bit. then we simply do OR 100 with this numbers.
// here there is 3 or (4-1) zeroes we need after 1 and we can get by left shift operator. 1<<4 or 1<<5-1
// so in general 1<<n-1

import java.util.*;
public class bit10{

        public static void main(String[] args)
          {
                Scanner sc = new Scanner(System.in);
                int num = sc.nextInt();
                int i = sc.nextInt();
                
                int m = 1<<(i-1);
                System.out.println(num | m);
          }
}