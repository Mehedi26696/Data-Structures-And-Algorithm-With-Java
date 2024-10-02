
//Given a number find it's odd or even

//If a number in binary  lSB or last digit is one then it's odd if not then it's even

// odd numbers & 1 = 1
// evem numbers & 1 = 0

import java.util.*;
public class bit7{

        public static void main(String[] args)
          {
                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();
                if((n&1) == 1){
                    System.out.println("Given Number is odd");
                }
                else{
                    System.out.println("Given Number is even");
                }
          }
}
