

//how many times a digit exist in a number

import java.util.*;
public class loop15{

        public static void main(String[] args)
          {
                Scanner sc = new Scanner(System.in);
                long num = sc.nextLong();
                int digit = sc.nextInt();
                int count =0;
                while(num%10>0)
                {
                    if((num%10)==digit)
                    {
                        count++;
                    }
                    num=num/10;
                }
                System.out.println(count);
          }
}
