


// * 
// * * 
// * * *
// * * * *

import java.util.*;
public class pat2{

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
                
                tringle(r,c+1);
                System.out.print("*");
            }
            else{
                
                tringle(r-1,0);
                System.out.println();
            }
        }
}