
// find an unique elements of an array

import java.util.*;
public class bit8{

        public static void main(String[] args)
          {
                Scanner sc = new Scanner(System.in);
                int size = sc.nextInt();
                int [] arr = new int[size];
                for(int i=0; i<arr.length;i++)
                {
                     arr[i] = sc.nextInt();
                }
                
                int ans = 0;
                for(int i=0; i<arr.length;i++)
                {
                   ans^=arr[i];
                }

                System.out.println(ans);
          }
}
