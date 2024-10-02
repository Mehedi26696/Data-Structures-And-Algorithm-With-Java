
//string method

import java.util.*;
public class str12{

        public static void main(String[] args)
          {
                Scanner sc = new Scanner(System.in);

                String name ="Mehedi";

                System.out.println(name.toCharArray());

                System.out.println(Arrays.toString(name.toCharArray()));

                System.out.println(name.indexOf('h'));

                System.out.println(name.indexOf('e'));

                System.out.println("      liverpool    ".strip());
  

                String str = "Dhaka University";

                System.out.println(Arrays.toString(str.split(" ")));
          }
}
