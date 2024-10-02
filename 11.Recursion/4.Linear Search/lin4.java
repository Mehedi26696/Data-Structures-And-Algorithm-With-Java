
//Find all occurences
//Return arrayList without passing

import java.util.*;
public class lin4{

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
         
        public static ArrayList<Integer> check(int[]arr,int target,int index)
        {    
            ArrayList<Integer> list = new ArrayList<>();
             if(index==arr.length){
                return list;
             }
             if(arr[index]== target)
             {
                list.add(index);
             }
           ArrayList<Integer> ansFromBelowCalls =  check(arr,target,index+1);

           list.addAll(ansFromBelowCalls);
           return list;

            
        }
         
}