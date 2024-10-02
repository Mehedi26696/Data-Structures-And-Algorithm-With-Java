//reverse a number


import java.util.*;
public class rec11{
        static int ans =0;
        public static void main(String[] args)
          {
                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();
               
                reverse(n);
                
                System.out.println(ans);
          }
        public static void reverse(int n)
        {
            if(n<=0){
                return;
            }
            ans=ans*10+(n%10);
            reverse(n/10);
            
             

        }
}