

//Pallindrome check


import java.util.*;
public class str21{

        public static void main(String[] args)
          {
                Scanner sc = new Scanner(System.in);

                String str = sc.next();

                if(Pallindrome(str))
                {
                    System.out.println("Given string is a pallindrome");
                }

                else
                {
                    System.out.println("Given string is not a pallindrome");
                }
                 
          }
        public static boolean Pallindrome(String str)
        {
            str = str.toLowerCase();

            for(int i = 0; i<=str.length()/2;i++)
            {
                char start = str.charAt(i);
                char end = str.charAt(str.length()-1-i);
                if(start!= end)
                {
                    return false;
                }
            }

            return true;
        }
}
