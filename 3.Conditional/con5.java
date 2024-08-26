

import java.util.*;
public class con5{

        public static void main(String[] args)
          {
                Scanner sc = new Scanner(System.in);
                String fruit = sc.next();

                switch(fruit){
                    
                    case "mango": System.out.println("King of fruits");
                    break;

                    case "apple":System.out.println("It's a red one");
                    break;
                    
                    case "banana":System.out.println("Not a good one");
                    break;

                    default :System.out.println("Invalid Fruits");
                }
                 
          }
}
