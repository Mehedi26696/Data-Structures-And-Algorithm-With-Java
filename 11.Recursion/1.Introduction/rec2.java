

//numberexample
//print 1 2 3 4 5

//import java.util.*;
public class rec2{

        public static void main(String[] args)
          {
                //Scanner sc = new Scanner(System.in);
                print1(1);
                //print(1);
          }

        public static void print1(int n)
        {
            System.out.println(n);
           // print2(2);
            print2(n+1);
        }
         public static void print2(int n)
        {
            System.out.println(n);
            //print3(3);
            print3(n+1);
        }
         public static void print3(int n)
        {
            System.out.println(n);
            //print4(4);
            print4(n+1);
        }
         public static void print4(int n)
        {
            System.out.println(n);
            //print5(5);
            print5(n+1);
        }
         public static void print5(int n)
        {
            System.out.println(n);
        }

        //better way to do this

        //   public static void print(int n)
        // {   
        //     //terminator
        //     if(n>5)
        //     {
        //         return;
        //     }
        //     System.out.println(n);
            
        //     print(n+1);
             
        // }

        //and this called recursion and terminator called base case
        //the recusriosn is the function called itself



}
