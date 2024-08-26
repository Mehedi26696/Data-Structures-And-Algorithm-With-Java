
//reverse a number

import java.util.*;
public class loop16{

        public static void main(String[] args)
          {
                Scanner sc = new Scanner(System.in);
                long num = sc.nextLong();

                long res=0;
                long c;
                while((num%10)>0)
                {
                    c = num%10;
                    res =res*10+c;
                    num=num/10;
                }
                System.out.println(res);
          }
}
