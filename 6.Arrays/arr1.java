//array
//creating 
//syntax-> datatype[] variable_name = new datatype[size] or datatype variable_name[] = new datatype[size]
//all the data in array should be same
// int[] marks; declaration of array. marks is getting defined in the stack
//marks = new int[3];initialization: actually here object is being created in the memory(heap)
//in java arrays are not continuous because it's in heap(there is no pointer concept in java)
//new is used to create an object
import java.util.*;
public class arr1{

        public static void main(String[] args)
          {
                Scanner sc = new Scanner(System.in);

            //     int marks[] = new int[3];

            //         for(int i =0;i<3;i++)
            //     {
            //        System.out.println(marks[i]);  //before initialization the default value for integer array is 0
            //     }


                 
            //     marks[0]=23;
            //     marks[1]=56;
            //     marks[2]=67;
            //     for(int i =0;i<3;i++)
            //     {
            //        System.out.println(marks[i]);
            //     }
                
              String[] arr =new String[3];

                  for(int i =0;i<3;i++)
                {
                   System.out.println(arr[i]);//before initialization the default value for string array is Null
                }
          }
}
