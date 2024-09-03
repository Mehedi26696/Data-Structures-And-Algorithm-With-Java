
//Given a zero-based permutation nums (0-indexed), build an array ans of the same length where ans[i] = nums[nums[i]] for each 0 <= i < nums.length and return it.

import java.util.*;
public class arr13{

        public static void main(String[] args)
          {
                Scanner sc = new Scanner(System.in);
                int size = sc.nextInt();

                //by array
                // int[] arr = new int[size];
                // for(int i=0;i<arr.length;i++)
                // {
                //     arr[i] = sc.nextInt();
                // }
                // int [] ans = new int[arr.length];
                // for(int i=0;i<ans.length;i++)
                // {
                //     ans[i] = arr[arr[i]];
                // }

                // System.out.print(Arrays.toString(ans));


                //By arraylist
                // ArrayList<Integer> arr = new ArrayList<>();
                // ArrayList<Integer> ans = new ArrayList<>();
                // for(int i = 0;i<size;i++)
                // {    
                //      arr.add(sc.nextInt());
                // }

                // for(int i = 0;i<size;i++)
                // {     
                //     ans.add(arr.get(arr.get(i)));
                // }
                // System.out.print(ans);
          }
}
