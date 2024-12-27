
/*
Given an integer array nums, return true if any value appears at least twice in the
array, and return false if every element is distinct.

*/


import java.util.*;

public class pq1 {


    //my attemted solution it has time complexity of O(n^2)
    public static boolean Question1(int nums[]){
        
        int n=nums.length;
        boolean found=false;

        for(int i=0;i<n;i++){
            int current=nums[i];
            for(int j=i+1;j<n;j++){
                if(current==nums[j]){
                   /*  found=true;
                    break; */
                    return true;
                }
            }
        }
        
        return false;
    }



    /*Efficient Lookup: The primary reason to use a HashSet is 
    its constant-time average performance for the contains() and add() operations. In a HashSet,
     both operations typically run in O(1) time, meaning they are very fast, 
    even as the collection grows. This makes it ideal for checking if an element has already been encountered. */

    public static boolean containsDuplicate (int [] nums) {

        HashSet<Integer> set = new HashSet<>();
        
        for(int i=0; i<nums.length; i++) {
        if (set.contains (nums [i]) ) {
        return true;
        } else {
        
        set.add (nums [i]) ;
        }
    }
        
        return false;
}



    
     public static void main(String[] args) {
        int nums1[]={1,2,3,1};
        int nums2[]={1,2,3,4};
        int nums3[]={1,1,1,3,3,4,3,2,4,2};
        System.out.println("Test 1: "+Question1(nums1)); //true
        System.out.println("Test 2: "+Question1(nums2)); //false
        System.out.println("Test 3: "+Question1(nums3)); //true
       
       
        System.out.println("Test 1: "+containsDuplicate(nums1)); //true
        System.out.println("Test 2: "+containsDuplicate(nums2)); //false
        System.out.println("Test 3: "+containsDuplicate(nums3)); //true




        
     }
}