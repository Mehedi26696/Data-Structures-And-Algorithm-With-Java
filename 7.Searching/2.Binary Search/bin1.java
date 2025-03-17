
//Binary search
//array must be sorted(either ascending or descending)

//best case for binary search is first mid elements is target
//best case: time complexity-> O(1)
//worst case: time complexity-> O(log(n))
import java.util.*;
public class bin1{


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
                System.out.println(binarysearch(arr,target));
  
          }

        public static int binarysearch(int[] arr,int target)
        {   
            int s = 0;
            int e = arr.length-1;
            int mid =s+(e-s)/2;
            while(s<=e)
            {
                 
                 if(target == arr[mid])
                 {
                    return mid;
                 } 
                // ascending order sorted
                 else if(target<arr[mid])
                 {
                    e=mid-1;
                 }
                 else{
                    s=mid+1;
                 }


               //descending order sorted
               //   else if(target>arr[mid])
               //   {
               //      e=mid+1;
               //   }
               //   else{
               //      s=mid-1;
               //   }


                 //mid update
                 mid =(s+e)/2;
            }

            return -1;

        }
}
