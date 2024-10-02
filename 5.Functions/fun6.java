
//variable arguments(varargs)
//when we don't know how many arguments will come
//int ...v take arguments as a array of integers

import java.util.*;
public class fun6{

        public static void main(String[] args)
          {
                Scanner sc = new Scanner(System.in);
                fun(1,2,4,6,7,744,77,4,6,8);

                fun2(4,5,"fehiufh","heiufh");
          }

        static void fun(int ...v)
        {
            System.out.println(Arrays.toString(v));
        }

        static void fun2(int a,int b, String ...v)  //variable arguments should be at the end
        {
              System.out.println(a+" "+b+" "+Arrays.toString(v));
        }
}
