

//StringBuilder
import java.util.*;
public class str20{

        public static void main(String[] args)
          {
                Scanner sc = new Scanner(System.in);
                
                StringBuilder builder = new StringBuilder();

                for(int i =0;i<26;i++)
                {
                    char ch =(char)('a'+i);
                    builder.append(ch);  //differnce here there is no new string is created and It's mutable
                }

                System.out.println(builder);

                builder.deleteCharAt(0);

                System.out.println(builder);

                System.out.println(builder.charAt(8));

                builder.reverse();

                System.out.println(builder);


          }
}
