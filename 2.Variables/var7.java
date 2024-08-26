
//autometic type promotion in expressions


//in byte we can store only (-128 to 127)

//after type casting ans will be (input%256) and ans should have been in the range of(-128 to 127)


import java.util.*;
public class var7{

        public static void main(String[] args)
          {
                Scanner sc = new Scanner(System.in);

                // int a = 56;
                // byte b = (byte)(a);
                // System.out.println(b);//ans->56

                // int c = 127;
                // byte d = (byte)(c);
                // System.out.println(d);//ans->127

                // int a = 128;
                // byte b = (byte)(a);
                // System.out.println(b);//ans-> -128

                //  int a = 250;
                // byte b = (byte)(a);
                // System.out.println(b);//ans-> -6

                //  int a = 256;
                // byte b = (byte)(a);
                // System.out.println(b);//ans-> 0

                //  int a = 356;
                // byte b = (byte)(a);
                // System.out.println(b);//ans->100

                //  int a = 390;
                // byte b = (byte)(a);
                // System.out.println(b);//ans-> -122

                //  int a = -56;
                // byte b = (byte)(a);
                // System.out.println(b);//ans->-56


                //  int a = -156;
                // byte b = (byte)(a);
                // System.out.println(b);//ans->100

                byte a =40;
                byte b =50;
                byte c = 100;

                int d =a*b/c;//when the calculations happen in byte it's autometically convert into integer  
                System.out.println(d);

                int num ='a';
                System.out.println(num);

          }
}
