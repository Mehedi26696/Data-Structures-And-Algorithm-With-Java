//stringbuilder
//Set a Character at Index


import java.util.*;
public class str11{

        public static void main(String[] args)
          {
                Scanner sc = new Scanner(System.in);
                
                String sb = sc.next();
                StringBuilder sr = new StringBuilder(sb);
                
                sr.setCharAt(3,'q');
                
                System.out.println(sr);
          }
}