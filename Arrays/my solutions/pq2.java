/*

Question 2: There is an integer array nums sorted in ascending order (with distinct values).
Prior to being passed to your function, nums is possibly rotated at an unknown
pivot index k (1 <= k < nums.length) such that the resulting array is [nums[k],
nums[k+1], ... , nums[n-1], nums[0], nums[1], ... , nums[k-1]] (0-indexed). For
at

Given the array nums after the possible rotation and an integer target, return the
index of target if it is in nums, or -1 if it is not in nums.
You must write an algorithm with O(log n) runtime complexity.

*/



import java.util.*;

public class pq2 {

    public static int solution(int nums[],int target){
        int n=nums.length;
        int min=0;

        for(int i=1;i<n;i++){
            int current=i;
            if(nums[current]<nums[min]){
                min=current;
            }
        }

        if(nums[min]==target){
            return min;
        }else{
            return -1;
        }
    }

    public static void main(String[] args) {

        //test case 1
        int nums1[]={4,5,6,7,0,1,2};
        int target1=0;

        //test case 2
        int nums2[]={4,5,6,7,0,1,2};
        int target2=3;

        //test case 3
        int nums3[]={1};
        int target3=0;

        long starttime=System.nanoTime();
        System.out.println("test case 1:"+solution(nums1,target1)); // output=4
        long endtime=System.nanoTime();
        long duration=endtime-starttime;
        System.out.println("duration:"+duration);
        

        starttime=System.nanoTime();
        System.out.println("test case 2:"+solution(nums2,target2)); //outoput=-1
        endtime=System.nanoTime();
        System.out.println("duration:"+duration);

        starttime=System.nanoTime();
        System.out.println("test case 3:"+solution(nums3,target3)); //output=-1
        endtime=System.nanoTime();
        System.out.println("duration:"+duration);
        
    }
}
