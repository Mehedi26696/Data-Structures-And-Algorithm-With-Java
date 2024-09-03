
//order-agnostic binary
//when we don't know array is ascending order sorted or descending order sorted

import java.util.*;
public class bin2{


        public static void main(String[] args)
          {
                Scanner sc = new Scanner(System.in);
                
                int size = sc.nextInt();
                int[] arr = new int[size];
                for(int i=0;i<arr.length;i++)
                {
                    arr[i] = sc.nextInt();
                }

                int target =sc.nextInt();
                 
                System.out.println(order_agnostic_binarysearch(arr,target));
                
          }

        public static int order_agnostic_binarysearch(int[] arr,int target)
        {   
            int s = 0;
            int e = arr.length-1;
            int mid =s+(e-s)/2;
            boolean check = arr[s]<arr[e];
            while(s<=e)
            {
                 
                 if(target == arr[mid])
                 {
                    return mid;
                 } 
                 
                 if(check)
                 {
                    //ascending
                        if(target<arr[mid])
                         {
                             e=mid-1;
                         }
                         else
                         {
                             s=mid+1;
                         }
                 }
                 else
                 {
                    //descending
                       if(target>arr[mid])
                         {
                             e=mid+1;
                         }
                        else
                        {
                             s=mid-1;
                        }

                 }
                 //mid update
                 mid =(s+e)/2;
            }

            return -1;

        }


          
}