
//Find if array is sorted or not
//more clean code
import java.util.*;
public class prob2{

        public static void main(String[] args)
          {
                Scanner sc = new Scanner(System.in);
                int size = sc.nextInt();
                int [] arr = new int[size];
                for(int i=0;i<size;i++){
                    arr[i]=sc.nextInt();
                }
                if(check(arr,0)){
                    System.out.println("Array is sorted");
                }
                else{
                    System.out.println("Array is not sorted");
                }
          }
        public static boolean check(int[]arr,int index)
        {
            if(index == arr.length-1){
                return true;
            }
             
            return arr[index]<arr[index+1] && check(arr,index+1); 
            
        }
         
}