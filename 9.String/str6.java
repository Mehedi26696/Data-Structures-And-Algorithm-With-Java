
//Operators

import java.util.*;
public class str6{

        public static void main(String[] args)
          {
                Scanner sc = new Scanner(System.in);
                System.out.println('a'+'b');
                System.out.println("a"+"b");
                System.out.println('a'+3);
                System.out.println((char)('a'+3));
                System.out.println('a'+"b");
                System.out.println("a"+3);  //integer will converted to Integer that will call to string(). After few steps that will be same as "a"+"3"
                
                //in java in println for object called method toString.And convert it into string
                System.out.println("Mehedi" + new ArrayList<>());

                System.out.println("Mehedi" + new Integer(56));


                //System.out.println(new Integer(56) + new ArrayList<>()); this will give error
                //In java + operator is defined for primitives or one of the values have to be String

                 System.out.println("Mehedi" +""+ new Integer(56));

                




          }
}
