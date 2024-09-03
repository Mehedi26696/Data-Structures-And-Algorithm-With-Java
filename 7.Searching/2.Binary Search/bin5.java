
//https://leetcode.com/problems/find-smallest-letter-greater-than-target/description/

//Find Smallest Letter Greater Than Target

//You are given an array of characters letters that is sorted in non-decreasing order, and a character target. There are at least two different characters in letters.

//Return the smallest character in letters that is lexicographically greater than target. If such a character does not exist, return the first character in letters.

import java.util.*;
public class bin5{


        public static void main(String[] args)
          {
                Scanner sc = new Scanner(System.in);
                
               // int size = sc.nextInt();
                char[] arr = sc.next().toCharArray();
                // for(int i=0;i<arr.length;i++)
                // {
                //     arr[i] = sc.next().charAt(i);
                // }

                char target =sc.next().charAt(0);
                System.out.println(binarysearch(arr,target));
          }

        public static char binarysearch(char[] arr,char target)
        {   
            int s = 0;
            int e = arr.length-1;
            int mid =s+(e-s)/2;
            while(s<=e)
            {
                //  if(target == arr[mid])
                //  {
                //     return arr[mid];
                //  } 
                 if(target<arr[mid])
                 {
                    e=mid-1;
                 }
                 else{
                    s=mid+1;
                 }


    
       
                 mid =(s+e)/2;
            }

            return arr[s%arr.length];  //mod by length-> if target is greater than largest elements of the array then print the first index and we get it through mod by length

        }
}
