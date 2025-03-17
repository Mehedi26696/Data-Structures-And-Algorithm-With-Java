



//Floor of a number
//If array is [2,3,5,9,14,16,18] and target is 15
//then ceiling is -> biggest element in array that is smaller or equal to the target
//then in this case ans is 14
//if target is 4 then answer is 3


import java.util.*;
public class bin4{


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
                System.out.println(arr[binarysearch(arr,target)]);
                sc.close();
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

                 //mid update
                 mid =(s+e)/2;
            }

            return e;

        }
}
