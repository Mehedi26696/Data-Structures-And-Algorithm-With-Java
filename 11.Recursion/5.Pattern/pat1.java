//

// * * * *
// * * *
// * *
// *

import java.util.*;
public class pat1{

        public static void main(String[] args)
          {
                Scanner sc = new Scanner(System.in);
                
                 tringle(4,0);
          }
        public static void tringle (int r,int c){
            if(r==0){
                return;
            }
            if(c<r){
                System.out.print("*");
                tringle(r,c+1);
            }
            else{
                System.out.println();
                tringle(r-1,0);
            }
        }
}
