
//Find peak element

//https://leetcode.com/problems/find-peak-element/description/

//A peak element is an element that is strictly greater than its neighbors.

//nums = [1,2,3,1]  ans would be 2(index)

//nums = [1,2,1,3,5,6,4] ans would be 5 (index)


//solution will same as the solution of peak in a mountain array problem


import java.util.*;
public class bin10{


        public static void main(String[] args)
          {
                Scanner sc = new Scanner(System.in);
                
                int size = sc.nextInt();
                int[] arr = new int[size];
                for(int i=0;i<arr.length;i++)
                {
                    arr[i] = sc.nextInt();
                }             
                System.out.println(binarysearch(arr));
          }
        public static int binarysearch(int[] arr)
        {   
            int s =0;
            int e = arr.length-1;
            
            int mid =s+(e-s)/2;
            while(s<e)
            {
                 
                 if(arr[mid]>arr[mid+1])
                 {  
                    //decrising part
                    //this maybe the ans ,but look at left
                    //this why end != mid-1
                    e=mid;
                 }
                 else  
                 {  
                    //incrising part
                    s=mid+1;
                    //because we know that mid+1 element> mid element
                 }
                 //mid update
                 mid =(s+e)/2;
            }

            //in the end start == end and pointing to the largest number because of the 2 checks above
            //start and end are always trying to find max element in the above 2 checks
            //hence,when they are pointing to just one element,that is the max one because that is what the checks say
            // more elaboration: at every point of time for start and end,they have the best possible answer till that time 
            //if we are saying that only one item is remaining,hence cause of above line that is the best possible answer

            return s; //or return e as both are equal

        }
}