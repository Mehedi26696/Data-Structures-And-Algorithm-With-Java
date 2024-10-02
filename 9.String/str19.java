
//Append a char 

import java.util.*;
public class str19{

        public static void main(String[] args)
          {
                Scanner sc = new Scanner(System.in);
                
                String sb = sc.next();
                StringBuilder sr = new StringBuilder(sb);
                
                sr.append("Nice");
                
                System.out.println(sr);
                System.out.println(sr.length());
          }
}