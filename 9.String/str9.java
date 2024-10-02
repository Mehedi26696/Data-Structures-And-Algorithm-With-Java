//Compare strings

import java.util.*;
public class str9{
        
        public static boolean compare(String s1, String s2)
        {
            if(s1.length()!= s2.length())
            {
                return false;
            }
            else
            {
                for(int i = 0; i<s1.length();i++)
                {
                    if(s1.charAt(i)==s2.charAt(i))
                    {

                    }

                    else
                    {
                        return false;
                    }
                }
            }
            return true;
        }

        public static void main(String[] args)
          {
                Scanner sc = new Scanner(System.in);

                String str1 = sc.next();
                String str2 = sc.next();

                //wrong answer

                // if(str1 == str2)
                // {
                //     System.out.println("Equal");
                // }
                // else
                // {
                //      System.out.println("Not Equal");
                // }
                
                //one way
                //  if(compare(str1,str2))
                //  {
                //      System.out.println("Equal");
                //  }
                //  else
                //  {
                //      System.out.println("Not Equal");
                //  }

                 //another way

                  if(str1.equals(str2))
                 {
                     System.out.println("Equal");
                 }
                 else
                 {
                     System.out.println("Not Equal");
                 }


          }
}
