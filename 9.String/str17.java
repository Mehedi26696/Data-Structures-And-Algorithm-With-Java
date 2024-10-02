//Insert a Character at Some Index

import java.util.*;
public class str17{

        public static void main(String[] args)
          {
                Scanner sc = new Scanner(System.in);
                
                String sb = sc.next();
                StringBuilder sr = new StringBuilder(sb);
                
                sr.insert(3,'q');
                
                System.out.println(sr);
          }
}