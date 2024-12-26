package Arrays;

public class pq5 {


    public static void solution(int nums[]){
        int n=nums.length;

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int k=i;k<=j;k++){
                    if(i!=j && i!=k && j!=k &&
                        nums[i]+nums[j]+nums[k]==0
                    ){
                        System.out.print(nums[i]+" "+nums[j]+" "+nums[k]+" ");
                        
                    }
                }
                System.out.println("");
            }
        }

    }

    public static void main(String[] args) {
        int nums[]={-1,-0,1,2,-1,-4};
        solution(nums);
        //System.out.println("test case 1: "+solution(nums));
        
    }
}
