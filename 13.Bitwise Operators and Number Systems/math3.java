//Prime in range in better way
// Sieve of Eratosthenes
//TIme complexity is O(n*log(logn))

import java.util.*;
public class math3{

        public static void main(String[] args)
          {
                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();
                boolean[] primes = new boolean[n+1];
                //initially boolean array contains all elements false
                sieve(n,primes);
                
          }
        //false in array means number is pime
        public static void sieve(int n,boolean[] primes){
            for(int i=2;i*i<=n;i++)
            if(!primes[i]){
                for(int j=i*2;j<=n;j+=i){
                    primes[j] = true;
                }
            }

            for(int i=2;i<=n;i++){
                if(!primes[i]){
                    System.out.print(i+" ");
                }
            }
        }
}
