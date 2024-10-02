//Find if array is sorted or not

import java.util.*;
public class prob1{

        public static void main(String[] args)
          {
                Scanner sc = new Scanner(System.in);
                int size = sc.nextInt();
                int [] arr = new int[size];
                for(int i=0;i<size;i++){
                    arr[i]=sc.nextInt();
                }
                if(check(arr)){
                    System.out.println("Array is sorted");
                }
                else{
                    System.out.println("Array is not sorted");
                }
          }
        public static boolean check(int[]arr)
        {
            if(arr.length==1){
                return true;
            }
            else{
                
            }
            return help(arr,0);
            
        }
        public static boolean help(int[]arr,int index){
            if(index==arr.length-1)
            {
                return true;
            }
            if(arr[index]>arr[index+1]){
                return false;
            }
            else{
                return help(arr,index+1);
            }
        }
}
