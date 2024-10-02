
//Find ith bit of a number

// For example number is 10110110 and we want 5th bit. then we simply do and 1000 with this numbers.
// here there is 4 or (5-1) zeroes we need after 1 and we can get by left shift operator. 1<<4 or 1<<5-1
// so in general 1<<n-1
//and then we have to perform ans>>n-1

import java.util.*;
public class bit9{

        public static void main(String[] args)
          {
                Scanner sc = new Scanner(System.in);
                int num = sc.nextInt();
                int i = sc.nextInt();
                
                int m = 1<<(i-1);
                System.out.println((num & m)>>(i-1));
          }
}
