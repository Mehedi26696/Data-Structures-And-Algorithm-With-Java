

import java.util.*;
public class var8{

        public static void main(String[] args)
          {
                Scanner sc = new Scanner(System.in);
                byte b = 42;
                char c ='a';
                short s =1024;
                int i = 50000;
                float f = 5.67f;
                double d = 0.1234;
                double result = (f*b) +(i/c)-(d-s);
                System.out.println((f*b)+" "+(i/c)+" "+(d-s));
                System.out.println(result);
          }
}
