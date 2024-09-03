//Find an element position in an infinite array
//basically infinite array means we can't use length of the array

//https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers/


import java.util.*;
public class bin8{


        public static void main(String[] args)
          {
                Scanner sc = new Scanner(System.in);
                
                int size = sc.nextInt();
                int[] arr = new int[size];
                for(int i=0;i<arr.length;i++)
                {
                    arr[i] = sc.nextInt();
                }

                int target =sc.nextInt();
                System.out.println(ans(arr,target));
          }
        
        public static int ans(int[] arr,int target)
        {
            //first find the range
            //first start with a box of size 2
            int start = 0;
            int end = 1;

            //condition for the target to lie in the range

            while(target>arr[end])
            {
                int newstart = end+1;
                //double the box value

                //end = previous end+sizeofbox*2
                //sizeofbox-> (end-start+1)

                end = end + (end-start+1)*2;

                start = newstart;


            }

            return binarysearch(arr,target,start,end);

        }

        public static int binarysearch(int[] arr,int target,int s,int e)
        {   
            
            int mid =s+(e-s)/2;
            while(s<=e)
            {
                 
                 if(target>arr[mid])
                 {
                    s=mid+1;
                 }
                 else if(target<arr[mid])
                 {
                    e=mid-1;
                 }
                 else{
                     
                    return mid;
                 }
                 //mid update
                 mid =(s+e)/2;
            }

            return -1;

        }
}