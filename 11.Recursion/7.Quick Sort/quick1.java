
//Quick sort

import java.util.*;
public class quick1{

        public static void main(String[] args)
          {
                Scanner sc = new Scanner(System.in);
                int [] arr = {4,7,8,9,5,7};
                sort(arr,0,arr.length-1);
                System.out.println(Arrays.toString(arr));
          }
        public static void sort(int[] arr,int low,int high){
            if(low>+high){
                return;
            }
            int s = low;
            int e = high;
            int mid = (s+e)/2;
            int pivot = arr[mid];
            while(s<=e){
                //if the array is already sorted then it will not sort again


                while(arr[s] < pivot){
                    s++;
                }
                 while(arr[e] > pivot){
                    e--;
                }
                if(s<=e){
                    int temp = arr[s];
                    arr[s] = arr[e];
                    arr[e] = temp;
                    s++;
                    e--;

                }
                
            }
            // now my pivot at correct index
            // sort 2 parts
            sort(arr,low,e);
            sort(arr,s,high);

        }
}
