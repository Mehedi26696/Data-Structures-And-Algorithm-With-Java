

//Concatenation (Joining 2 strings)
//Java Strings are Immutable

import java.util.*;
public class str2{

        public static void main(String[] args)
          {
                Scanner sc = new Scanner(System.in);

                String str1 = sc.next();

                String str2 = sc.next();
                
                String str3 = str1+" "+str2;
                System.out.println(str3);
                System.out.println(str3.length());

          }
}