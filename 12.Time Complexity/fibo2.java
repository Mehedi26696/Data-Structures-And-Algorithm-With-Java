
 //nth fibonacchi using direct formula
 //removing less dominating terms

 import java.util.*;
 public class fibo2{
 
        public static void main(String[] args)
           {
                 Scanner sc = new Scanner(System.in);
                // int n = sc.nextInt();
                //  for(int i=0;i<n;i++){
                //     System.out.println(fibonumber(i));
                //  }
                 System.out.println(fibonumber(50));
                  
           }
        public static long fibonumber(int n){
            return (long)(Math.pow(((1+Math.sqrt(5))/2),n)/Math.sqrt(5));
        }
 }