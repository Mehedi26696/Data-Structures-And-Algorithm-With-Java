
//AND Operator
// 0 & 0 = 0
// 0 & 1 = 0
// 1 & 0 = 0
// 1 & 1 = 1

//so, n & 1 = n
import java.util.*;
public class bit1{

        public static void main(String[] args)
          {
                Scanner sc = new Scanner(System.in);
                int a = sc.nextInt();
                int b = sc.nextInt();
                System.out.println(a & b);
          }
}
