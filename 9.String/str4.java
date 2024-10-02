
// println method always return string internally
// println calls valueof method then it called to string method
import java.util.*;
public class str4{

        public static void main(String[] args)
          {
                Scanner sc = new Scanner(System.in);

                String name = null;

                System.out.println(name);

                System.out.println(new int[]{1,2,3,4,5});

                //null   [I@7ef20235

                System.out.println(Arrays.toString(new int[]{1,2,3,4,5}));




          }
}