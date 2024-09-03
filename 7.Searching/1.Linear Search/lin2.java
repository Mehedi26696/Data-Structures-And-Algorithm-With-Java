//search in string

import java.util.*;
public class lin2{

        public static void main(String[] args)
          {
                Scanner sc = new Scanner(System.in);
                String str = sc.next();
                char target = sc.next().charAt(0);

                System.out.println(search(str,target));
          }
        
         //one way(return index)
        // public static int search(String str, char target)
        // {
            
        //     for(int i=0;i<str.length();i++)
        //     {
        //         if(target==str.charAt(i))
        //         {
        //             return i;
        //         }
        //     }
        //     return -1;
        // }
        

        //boolean (one way)
        // public static boolean search(String str,char target)
        // {
        //     if(str.length()==0)
        //     {
        //         return false;
        //     }
        //     for(int i =0;i<str.length();i++)
        //     {
        //         if(target == str.charAt(i))
        //         {
        //             return true;
        //         }
        //     }
        //     return false;
        // }

        //boolean for each loop

         public static boolean search(String str,char target)
        {
            if(str.length()==0)
            {
                return false;
            }
            for(char ch : str.toCharArray())  //to apply for each we have to convert string into a char array
            {
                if(ch == target)
                {
                    return true;
                }
            }
            return false;
        }
}
