
//array passing in function

import java.util.*;
public class arr9{
        
        static void change(int[] arr)
        {
            arr[2] = 45;
        }

        public static void main(String[] args)
          {
                Scanner sc = new Scanner(System.in);
                int[] nums = {3,5,67,8,2,4};
                System.out.println(Arrays.toString(nums));
                change(nums);
                System.out.println(Arrays.toString(nums));
          }
}
