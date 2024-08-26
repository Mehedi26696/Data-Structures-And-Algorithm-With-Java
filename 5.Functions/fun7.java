//function overloading
//to functions can co exist if there parameters are different

import java.util.*;
public class fun7{

        public static void main(String[] args)
          {
                Scanner sc = new Scanner(System.in);

                int a=8;
                int b=9;
                fun(a,b);
                fun(a);
                 
          }

        static void fun(int a,int b)
        {
            System.out.println(a+" "+b);
        }

        
        static void fun(int a)
        {
            System.out.println(a);
        }
}
