

//X-OR Operator
// 0 ^ 0 = 0
// 0 ^ 1 = 1
// 1 ^ 0 = 1
// 1 ^ 1 = 0


// so we can say

// a ^ 1 = a'
// a ^ 0 = a
// a ^ a = 0

// If we xor with a numbers then the LSB will flipped
// 100 ^ 1 = 101 
// 101 ^ 1 = 100
import java.util.*;
public class bit3{

        public static void main(String[] args)
          {
                Scanner sc = new Scanner(System.in);
                int a = sc.nextInt();
                int b = sc.nextInt();
                System.out.println(a ^ b);
          }
}
