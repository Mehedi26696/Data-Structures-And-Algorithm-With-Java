
//shadowijng
//using two variables with the same name wihin the scope that overlap

import java.util.*;
public class fun5{
        
        static int x = 90;//this will be shadowed in line 15

        public static void main(String[] args)
          {
                Scanner sc = new Scanner(System.in);
                System.out.println(x);
                int x = 40;
                System.out.println(x);
                fun();
          }
        
        static void fun(){
            System.out.println(x);
        }
}
