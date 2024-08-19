
//nested if-else

import java.util.*;
public class con3{

        public static void main(String[] args)
          {
                Scanner sc = new Scanner(System.in);

                int a = sc.nextInt();

                if(a<15)
                {
                    if(a<10)
                    {
                        System.out.println("a is smaller than 10 and 15");
                    }
                    else
                    {
                        System.out.println("a is smaller then 15 but greater than 10");
                    }
                }

                else{
                    System.out.println("a is greater than 15");
                }

                 
          }
}
