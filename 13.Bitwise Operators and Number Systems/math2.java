//Prime number in range

import java.util.*;
public class math2{

        public static void main(String[] args)
          {
                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();
                for(int i = 1;i<=n;i++){

                    if(prime(i)){
                    System.out.println(i+" is a prime number");
                    }
                 

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