

// Determine if a number is happy or not.
// A number is happy if it eventually reaches 1 when replaced by the sum of the square of each digit. 
//For example, 19 is a happy number because
//  1^2 + 9^2 = 82,
//   8^2 + 2^2 = 68, 
//   6^2 + 8^2 = 100, 
//   1^2 + 0^2 + 0^2 = 1.

// https://leetcode.com/problems/happy-number/description/


import java.util.Scanner;
public class Question_8 {

    private static int findsquare(int n) {
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit;
            n /= 10;
        }
        return sum;
    }

    public static boolean ishappy(int n) {
        int slow = n;
        int fast = n;
        do {
            slow = findsquare(slow);
            fast = findsquare(findsquare(fast));
            
        } while (slow != fast);
         
        if(slow == 1) {
            return true;
        } else {
            return false;
        }
        

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.println(ishappy(n));

        sc.close();

      
    }
    
}
