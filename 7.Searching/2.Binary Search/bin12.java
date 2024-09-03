
//Search in Rotated Sorted Array

//https://leetcode.com/problems/search-in-rotated-sorted-array/description/

//nums = [4,5,6,7,0,1,2], target = 0  Output: 4(index)




import java.util.*;
public class bin12{


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
            int pivot =  findPivot(arr);
            
            //if we did not find a pivot, that means the array is not rotated

            if(pivot == -1)
            {
                //just do normal binary search

                return binarysearch(arr,target,0,arr.length-1);
            }

            //if pivot is found, it means we get 2 ascending sorted arrays
            
            if(arr[pivot] == target)
            {
                return pivot;
            }

            if(target>= arr[0])
            {
                return binarysearch(arr,target,0,pivot-1);
            }
            else
            {
                return binarysearch(arr,target,pivot+1,arr.length-1);
            }
        }
        
        public static int findPivot(int[] arr)
        {   
            int s =0;
            int e = arr.length-1;
            
            int mid =s+(e-s)/2;
            while(s<=e)
            {
                 
                 //4 cases 
                 if(mid < e && arr[mid]>arr[mid+1])
                 {   
                    //if in some cases mid is the last element of this array then mid+1 gives error that's why we make a check 
                    //when we find  arr[mid]>arr[mid+1] this is pivot cause two part of of the array is sorted in ascending orde
                     return mid;
                 }
                 if( mid > s && arr[mid]<arr[mid-1])
                 {   
                    //if in some cases mid is the first element of this array then mid-1 gives error that's why we make a check 
                    //also when we find  arr[mid]<arr[mid-1] this is pivot cause two part of of the array is sorted in ascending order
                    return mid;
                 }
                 if(arr[mid]<=arr[s]) 
                 {  
                     
                    e = mid-1;
                     
                 }
                 else 
                 {
                    s = mid+1;
                 }
                 //mid update
                 mid =(s+e)/2;
            }
            return -1 ;  

        }

         public static int binarysearch(int[] arr,int target,int start,int end)
        {   
            int s = start;
            int e = end;
            int mid =s+(e-s)/2;
            while(s<=e)
            {
                 
                 if(target<arr[mid])
                 {
                      e = mid-1;
                 } 
                 else if(target>arr[mid])
                 {
                     s = mid+1;
                 }
                 else
                 {
                      return mid;
                 }
                 //mid update
                 mid =(s+e)/2;
            }

            return -1;

        }
        
}