
//Find in Mountain Array
////https://leetcode.com/problems/find-in-mountain-array/description/

//array = [1,2,3,4,5,3,1], target = 3  Output: 2(index)
//3 exists in the array, at index=2 and index=5. Return the minimum index, which is 2.
//if not exists return -1


//solution appraoch
//Find peak element index
//search in ascending array (0 to peak element index)
//if not exist in ascending then search in descending array(peak element index to arr.length-1)
//if element not in the array return -1




import java.util.*;
public class bin11{


        public static void main(String[] args)
          {
                Scanner sc = new Scanner(System.in);
                
                int size = sc.nextInt();
                int[] arr = new int[size];
                for(int i=0;i<arr.length;i++)
                {
                    arr[i] = sc.nextInt();
                } 

                int target = sc.nextInt();

                System.out.println(search(arr,target));                       
          }

        public static int search(int[] arr,int target)
        {
            int peak =  findpeakelementindex(arr);

            int firstTry = order_agnostic_binarysearch(arr,target,0,peak);

            if(firstTry!= -1)
            {
                return firstTry;
            }

            //search in second half
            return order_agnostic_binarysearch(arr,target,peak+1,arr.length-1);
        }
        
        public static int findpeakelementindex(int[] arr)
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

         public static int order_agnostic_binarysearch(int[] arr,int target,int start,int end)
        {   
            int s = start;
            int e = end;
            int mid =s+(e-s)/2;
            boolean check = arr[s]<arr[e];
            while(s<=e)
            {
                 
                 if(target == arr[mid])
                 {
                    return mid;
                 } 
                 
                 if(check)
                 {
                    //ascending
                        if(target<arr[mid])
                         {
                             e=mid-1;
                         }
                         else
                         {
                             s=mid+1;
                         }
                 }
                 else
                 {
                    //descending
                       if(target>arr[mid])
                         {
                             e=mid+1;
                         }
                        else
                        {
                             s=mid-1;
                        }

                 }
                 //mid update
                 mid =(s+e)/2;
            }

            return -1;

        }
        
}