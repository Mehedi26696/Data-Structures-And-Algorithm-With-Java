//If an array every number is repeated by p times and only one number is one time. Find the number

import java.util.*;
public class bit14{

        public static void main(String[] args)
          {
                Scanner sc = new Scanner(System.in);
                int size = sc.nextInt();
                int [] arr = new int[size];
                for(int i=0; i<arr.length;i++)
                {
                     arr[i] = sc.nextInt();
                }
                int p = sc.nextInt();
                System.out.println(detect(arr,p));
          }
        public static int detect(int[]arr,int repeatationTime)
        {      
               // create new array to store each bit
               int[] setBitArray = new int[32];
               //access each numbers in array
               for (int i : arr) {
                int index = 0;
                //add every bits in new array
                while(i > 0){
                setBitArray[index] += i & 1;  //find last bit
                i = i >> 1; // going to next bit
                index++;
                }
             }
        for (int i= 0; i < setBitArray.length; i++) {
            setBitArray[i] %= repeatationTime; 
        }

        int ans = 0;
        for (int i = 0; i < setBitArray.length; i++) {
            ans += setBitArray[i] * (int)Math.pow(2, i);
        }
        return ans;
       }
          
}
