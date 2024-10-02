
//Bit manipulation

import java.util.*;
public class op3{

        public static void main(String[] args)
          {
                Scanner sc = new Scanner(System.in);

                int a = sc.nextInt();
                //left shift(a<<n)->(multiply by 2^n)
                System.out.println(a<<3);

                //right shift(a>>n)(devide by 2^n)
                System.out.println(a>>3);
                 
          }
}
