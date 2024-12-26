package Arrays;

public class practiceq {


    public static boolean Question1(int nums[]){
        
        int n=nums.length;
        boolean found=false;

        for(int i=0;i<n;i++){
            int current=nums[i];
            for(int j=i+1;j<n;j++){
                if(current==nums[j]){
                    found=true;
                    break;
                }
            }
        }
        
        return found;
    }



    
     public static void main(String[] args) {
        int nums1[]={1,2,3,1};
        int nums2[]={1,2,3,4};
        int nums3[]={1,1,1,3,3,4,3,2,4,2};
        System.out.println("Test 1: "+Question1(nums1)); //true
        System.out.println("Test 2: "+Question1(nums2)); //false
        System.out.println("Test 3: "+Question1(nums3)); //true




        
     }
}