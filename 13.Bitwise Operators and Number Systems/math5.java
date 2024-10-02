//Newton Raphson Method
//FInding square root 

import java.util.*;
public class math5{

        public static void main(String[] args)
          {
                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();

                System.out.println(sqrt(n));
          }
        public static double sqrt(double n){
            double x = n;
            double root;
            while(true){
                root = 0.5*(x+(n/x));
                if(Math.abs(root-x)<0.5){   // we take error less than 0.5
                    break;
                }
                x = root;
            }
            return root;

        }

}
