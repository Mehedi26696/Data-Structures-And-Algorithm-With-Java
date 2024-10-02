
//Find all occurences
//Return arrayList

import java.util.*;
public class lin3{

        public static void main(String[] args)
          {
                Scanner sc = new Scanner(System.in);
                int size = sc.nextInt();
                int [] arr = new int[size];
                for(int i=0;i<size;i++){
                    arr[i]=sc.nextInt();
                }
                int target = sc.nextInt();
                ArrayList<Integer> list = new ArrayList<>();
                System.out.println(check(arr,target,0,list));
                 
          }
         
        public static ArrayList<Integer> check(int[]arr,int target,int index,ArrayList<Integer> list)
        {    
             if(index==arr.length){
                return list;
             }
             if(arr[index]== target)
             {
                list.add(index);
             }
            return check(arr,target,index+1,list);

            
        }
         
}