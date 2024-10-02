//Find a given number is power of 2 or not
//Exception for 0

import java.util.*;
public class bit19{

        public static void main(String[] args)
          {
                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();
                if((n & (n-1))== 0){
                    System.out.println("Given number is power of 2");
                }
                else{
                    System.out.println("Given number is not power of 2");
                }
          }
}
