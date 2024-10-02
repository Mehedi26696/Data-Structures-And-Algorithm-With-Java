


//numberexample
//print 5 4 3 2 1

import java.util.*;
public class rec3{

        public static void main(String[] args)
          {
                Scanner sc = new Scanner(System.in);
                //print1(1);
                print(1);
          }

        // public static void print1(int n)
        // {   
        //     print2(n+1);
        //      // print2(2);
        //     System.out.println(n);
          
            
        // }
        //  public static void print2(int n)
        // {   
        //     //print3(3);
        //     print3(n+1);
        //     System.out.println(n);

        // }
        //  public static void print3(int n)
        // {   
        //      //print4(4);
        //     print4(n+1);
        //     System.out.println(n);
           
        // }
        //  public static void print4(int n)
        // {   
        //     //print5(5);
        //     print5(n+1);
        //     System.out.println(n);
            
        // }
        //  public static void print5(int n)
        // {
        //     System.out.println(n);
        // }

        //better way to do this

          public static void print(int n)
        {   
            //terminator
            if(n>5)
            {
                return;
            }
            print(n+1);
            System.out.println(n);
            
            
             
        }

        // //and this called recursion and terminator called base case

        //function are initilized in stack
        //when a function finishing executing.It is removed from stack and the flow of program is re-stored to where the function is called 
        //If a function is called again and again,we can treat it as a separate call in the stack


        //why we use recursion
        //It help us in solving bigger/complex problems in a simple way
        //we can convert recursive solution into interative solutions and vice versa
        //space complexity is not constant because of recursive calls
        //It helps us breaking down bigger problems into smaller problems 


}