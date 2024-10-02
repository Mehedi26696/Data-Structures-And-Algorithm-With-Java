
//Find all occurences


import java.util.*;
public class lin2{

        public static void main(String[] args)
          {
                Scanner sc = new Scanner(System.in);
                int size = sc.nextInt();
                int [] arr = new int[size];
                for(int i=0;i<size;i++){
                    arr[i]=sc.nextInt();
                }
                int target = sc.nextInt();
                check(arr,target,0);
                System.out.println(list);
                 
          }
        static ArrayList<Integer> list = new ArrayList<>();
        public static void check(int[]arr,int target,int index)
        {    
             if(index==arr.length){
                return;
             }
             if(arr[index]== target)
             {
                list.add(index);
             }
            check(arr,target,index+1);

            
        }
         
}