
//Find index of a number

import java.util.*;
public class lin1{

        public static void main(String[] args)
          {
                Scanner sc = new Scanner(System.in);
                int size = sc.nextInt();
                int [] arr = new int[size];
                for(int i=0;i<size;i++){
                    arr[i]=sc.nextInt();
                }
                int target = sc.nextInt();
                System.out.println(check(arr,target,0));
                 
          }
        public static int check(int[]arr,int target,int index)
        {    
             if(index==arr.length){
                return -1;
             }
             if(arr[index]== target)
             {
                return index;
             }
             return check(arr,target,index+1);

            
        }
         
}