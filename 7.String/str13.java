//Delete char at some Index


import java.util.*;
public class str13{

        public static void main(String[] args)
          {
                Scanner sc = new Scanner(System.in);
                
                String sb = sc.next();
                StringBuilder sr = new StringBuilder(sb);
                
                sr.insert(3,'q');
                System.out.println(sr);

                sr.delete(0, 1);
                System.out.println(sr);

                sr.delete(0,3);
                System.out.println(sr);
          }
}