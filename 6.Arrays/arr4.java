

//Find the maximum & minimum number in an array of integers.


import java.util.*;
public class arr4{

        public static void main(String[] args)
          {
                Scanner sc = new Scanner(System.in);

                int size = sc.nextInt();

                int num[] = new int[size];
                 
                for(int i =0;i<size;i++)
                {
                    num[i] = sc.nextInt();
                }
                
                int max = Integer.MIN_VALUE;
                int min = Integer.MAX_VALUE;

                for(int i =0;i<num.length;i++)
                {
                     if(max<num[i])
                     {
                        max=num[i];
                     }

                     if(min>num[i])
                     {
                        min = num[i];
                     }
                }

                System.out.println("Maximum number :"+max);
                System.out.println("Minimum number :"+min);

                 


                
          }
}