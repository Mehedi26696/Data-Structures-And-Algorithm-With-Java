
import java.util.*;
public class bin1{

        public static void main(String[] args)
          {
                Scanner sc = new Scanner(System.in);
                int size = sc.nextInt();
                int[] arr = new int[size];
                for(int i =0;i<size;i++)
                {
                    arr[i]=sc.nextInt();
                }
                int target = sc.nextInt();

                System.out.println(binarySearch(arr,0,arr.length-1,target));
                 
          }
        public static int binarySearch(int[]arr,int s ,int e,int target)
        {
           int mid = s+(e-s)/2;
           if(s>e){
            return -1;
           }
           if(target == arr[mid]){
            return mid;
           }
           else if(target<arr[mid]){
              return binarySearch(arr,s,mid-1,target);
           }
           else{
             return binarySearch(arr,mid+1,e,target);
           }
        }
}
