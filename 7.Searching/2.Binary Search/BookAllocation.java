import java.util.*;

// Book Allocation Problem
// Given an array of integers A of size N and an integer B.
// College library has N books,the ith book has A[i] number of pages.
// You have to allocate books to B number of students so that maximum number of pages alloted to a student is minimum.
// A book will be allocated to exactly one student.
// Each student has to be allocated at least one book.
// Allotment should be in contiguous order, for example: A student cannot be allocated book 1 and book 3, skipping book 2.
// Calculate and return that minimum possible number.
// NOTE: Return -1 if a valid assignment is not possible.

// Input Format
// The first argument given is the integer array A.
// The second argument given is the integer B.

// Output Format
// Return that minimum possible number

// Constraints
// 1 <= N <= 10^5
// 1 <= A[i] <= 10^5
// 1 <= B <= 10^5

// For Example
// Input 1:
//     A = [12, 34, 67, 90]
//     B = 2
// Output 1:
//     113
// Explanation 1:
//     There are 2 number of students. Books can be distributed in following fashion :
//         1) [12] and [34, 67, 90]
//         Max number of pages is allocated to student 2 with 34 + 67 + 90 = 191 pages
//         2) [12, 34] and [67, 90] 
//         Max number of pages is allocated to student 2 with 67 + 90 = 157 pages
//         3) [12, 34, 67] and [90]
//         Max number of pages is allocated to student 1 with 12 + 34 + 67 = 113 pages
//     Of the 3 cases, Option 3 has the minimum pages = 113.

public class BookAllocation {

    public static boolean isPossible(ArrayList<Integer> arr, int n, int m, int mid) {
        int studentCount = 1;
        int pageSum = 0;

        for (int i = 0; i < n; i++) {
            if (pageSum + arr.get(i) <= mid) {
                pageSum += arr.get(i);
            } else {
                studentCount++;
                if (studentCount > m || arr.get(i) > mid) {
                    return false;
                }
                pageSum = arr.get(i);
            }
            if (studentCount > m) {
                return false;
            }
        }
        return true;
    }

    public static int allocateBooks(ArrayList<Integer> arr, int n, int m) {
        int s = 0;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += arr.get(i);
        }
        int e = sum;
        int ans = -1;
        int mid = s + (e - s) / 2;

        while (s <= e) {
            if (isPossible(arr, n, m, mid)) {
                ans = mid;
                e = mid - 1;
            } else {
                s = mid + 1;
            }
            mid = s + (e - s) / 2;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Book No");
        int n = sc.nextInt();
        System.out.println("Students Num");
        int m = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            arr.add(sc.nextInt());
        }
        System.out.println(allocateBooks(arr, n, m));
        sc.close();
    }
}
