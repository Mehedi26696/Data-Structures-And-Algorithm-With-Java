//pretty printing
//Format specifier


// There are many format specifiers we can use. Here are some common ones:

// %c - Character
// %d - Decimal number (base 10)
// %e - Exponential floating-point number
// %f - Floating-point number
// %i - Integer (base 10)
// %o - Octal number (base 8)
// %s - String
// %u - Unsigned decimal (integer) number
// %x - Hexadecimal number (base 16)
// %t - Date/time
// %n - Newline
import java.util.*;
public class str5{

        public static void main(String[] args)
          {
                Scanner sc = new Scanner(System.in);
                float a = 453.1234f;

                System.out.printf("Formatted number is %.2f",a);

                System.out.println();

                System.out.println(Math.PI);

                System.out.printf("Pie : %.3f",Math.PI);

                System.out.println();

                System.out.printf("Hello my name is %s and I am %s","Mehedi","Cool");
          }
}
