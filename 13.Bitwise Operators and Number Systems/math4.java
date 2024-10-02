//Square root of number
//Time complexity is O(logn)

import java.util.*;
public class math4{

        public static void main(String[] args)
          {
                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();
                int p = sc.nextInt();
                System.out.println(root(n,p));
          }
        public static double root(int n,int p){
            double ans = 0.0;
            int s = 0;
            int e = n;
            int mid = s+(e-s)/2;
            while(s<=e){
               
                if(mid*mid>n){
                    e=mid-1;
                }
                else if(mid*mid<n){
                    s = mid+1;
                }
                else{
                    return mid;
                }
                mid = (s+e)/2;
            }
            ans+=mid;
            double incr = 0.1;
            for(int i =0;i<p;i++){
                while(ans*ans<=n){
                   ans+=incr;
                }
                ans-=incr;
                incr=incr/10;
            }
            return ans;
        }
}
