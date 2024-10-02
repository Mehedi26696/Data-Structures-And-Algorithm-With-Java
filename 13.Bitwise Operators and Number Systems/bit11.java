
// Set the ith bit into 0

// for this we have to 
// For example number is 10110110 and we want to set zero in 5th bit. then we simply do and 11101111 with this numbers.
// here there is 4 or (5-1) 1 we need after 0 and we can get by taken complement of left shift operator. ~1<<4 or ~1<<5-1
// so in general ~1<<n-1

import java.util.*;
public class bit11{

        public static void main(String[] args)
          {
                Scanner sc = new Scanner(System.in);
                int num = sc.nextInt();
                int i = sc.nextInt();
                
                int m = ~(1<<(i-1));
                System.out.println(num & m);
          }
}