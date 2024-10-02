
//Prime number

import java.util.*;
public class math1{

        public static void main(String[] args)
          {
                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();
                if(prime(n)){
                    System.out.println("It's a prime number");
                }
                else{
                   System.out.println("It's not a prime number"); 
                }
                
          }
        public static boolean prime(int n){
            if(n<=1){
                return false;
            }
            for(int i = 2;i*i<=n;i++)
            {
                if(n%i==0){
                    return false;
                }
            }
            return true;
        }
}
