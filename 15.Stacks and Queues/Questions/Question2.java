
//  Game of Two Stacks

// https://www.hackerrank.com/challenges/game-of-two-stacks/problem

import java.util.Arrays;
import java.util.Scanner;

public class Question2 {

    static int twostacks(int max, int a[], int b[]) {
        return twostacks(max, a, b, 0, 0);
    }

    private static int twostacks(int max, int a[], int b[], int sum, int count) {

        if (sum > max) {
            return count;
        }

        if(a.length == 0 && b.length == 0){
            return count;
        }

        int ans1 = twostacks(max, Arrays.copyOfRange(a, 1, a.length), b, sum + a[0], count + 1);

        int ans2 = twostacks(max, a, Arrays.copyOfRange(b, 1, b.length), sum + b[0], count + 1);

        return Math.max(ans1, ans2);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        
        while (t> 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int x = sc.nextInt();

            int a[] = new int[n];
            int b[] = new int[m];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            for (int i = 0; i < m; i++) {
                b[i] = sc.nextInt();
            }

            System.out.println(twostacks(x, a, b)-1);
            
        }

        sc.close();

    }

}
