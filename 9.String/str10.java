
//String performance


import java.util.*;
public class str10{

        public static void main(String[] args)
          {
                Scanner sc = new Scanner(System.in);

                String series = "";
                for(int i = 0;i<26;i++)
                {
                    char ch = (char)('a'+i);
                   // System.out.println(ch);

                    series +=ch;
                    System.out.println(series); //each time create a new object(String) because we know string is immutable. For that many space are waste for creating a new string
                    //time complexity-> O(n^2)

                }

                System.out.println(series);
                
          }
}
