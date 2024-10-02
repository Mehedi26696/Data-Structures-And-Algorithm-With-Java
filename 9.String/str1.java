//string

import java.util.*;
public class str1{

        public static void main(String[] args)
          {
                Scanner sc = new Scanner(System.in);

            
            //Checking that if two refrence variables has sane string values .Is it point to the same object
            // == checks if ref variable are pointing to the same object


            

            // String a = "Mehedi";
            // String b = "Mehedi";
            // String c = "Hasan";
            // String d = b;
            // System.out.println(a==b); //It will give true
            // System.out.println(a==c); //It will give false
            //System.out.println(b==d); //It will give true
                
            //string input
            //   String name = sc.next();
            //   System.out.println(name);

            //line input
            //     String str = sc.nextLine();
            //     System.out.println(str);


            // String a = "mehedi";
            // Stirng b = "mehedi";

            //String store in String pool.String pool is a separate memory structure inside heap
            //Use case-> all the similar values are not recreate in pool and make program more optimize
            //So a and b point to the same string pool in heap

            //String is immutable. So we can't change


            // String str1 = "Dhaka";
            // System.out.println(str1);
            // str1 = "Madaripur"; //here we are not changing string we are creating a new string(object)
            // System.out.println(str1);



            //create diffrent string of same values by new keyword

            // String a = new String("Mehedi");
            // String b = new String("Mehedi");
            // System.out.println(a==b); //It gives false
            // //Creating these values outside the pool but in heap memory


            //when we only want to check valuse are equal are not we .equals method

            // String a = new String("Mehedi");
            // String b = new String("Mehedi");
            // System.out.println(a.equals(b)); //It gives true.Becuse both has same values

          }
}
