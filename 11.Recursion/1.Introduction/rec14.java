
//Count zeros in a number

import java.util.*;
public class rec14{

        public static void main(String[] args)
          {
                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();

            
                System.out.println(countzeros(n,0));
          }
        public static int countzeros(int n,int c)
        {   
            if(n==0){
                return c;
            }
            if(n%10 == 0){
                return countzeros(n/10,c+1);
            }
            else{
                return countzeros(n/10,c);
            }
        }
}
