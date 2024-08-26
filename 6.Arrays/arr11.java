

//if we don't know the size of array then we use ArrayList (it's similar to c++ vector)
//Syntax-> ArrayList<datatype> variable_name = new ArrayList<>();  //we have to wrapper classes for datatupe not primitive one

import java.util.*;
public class arr11{

        public static void main(String[] args)
          {
                Scanner sc = new Scanner(System.in);
                ArrayList<Integer> list = new ArrayList<>(3); //3 is initial capacity

                // list.add(67);
                // list.add(67);
                // list.add(44);
                // list.add(67);
                // list.add(45);
                // list.add(63);

                for(int i =0;i<5;i++)
                {
                    list.add(sc.nextInt());
                }

                for(int i =0;i<5;i++)
                {
                    System.out.print(list.get(i)+" ");  //list[index] will not work here
                }

                // System.out.println(list);

                // list.set(2,56);

                // System.out.println(list);

                // list.remove(3);

                // System.out.println(list);

                // System.out.println(list.contains(63));

                
 
          }
}
