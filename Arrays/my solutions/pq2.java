package Arrays;
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
        System.out.println("test case 1:"+solution(nums1,target1));
        long endtime=System.nanoTime();
        long duration=endtime-starttime;
        System.out.println("duration:"+duration);
        

        starttime=System.nanoTime();
        System.out.println("test case 2:"+solution(nums2,target2));
        endtime=System.nanoTime();
        System.out.println("duration:"+duration);

        starttime=System.nanoTime();
        System.out.println("test case 3:"+solution(nums3,target3));
        endtime=System.nanoTime();
        System.out.println("duration:"+duration);
        
    }
}
