
//Peak in Mountain array

//https://leetcode.com/problems/peak-index-in-a-mountain-array/description/

// if array is [1,3,4,6,5,2,0] then answer will be 3(index)



import java.util.*;
public class bin9{


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