
/*

Question 5: Given an integer array nums, return all the triplets [nums[i], nums[j],
nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.
Notice that the solution set must not contain duplicate triplets.

 */

import java.util.*;;

public class pq5 {


    //i failed to solve this problem in my way

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



    public static List<List<Integer>> threeSum(int nums []) {

            List<List<Integer>> result = new ArrayList <List<Integer>> ();

            for(int i=0; i<nums.length; i++) {

                for(int j=i+1; j<nums.length; j++) {

                    for(int k=j+1; k<nums. length; k++) {

                        if (nums [i] + nums [j] + nums [k] == 0) {

                            List<Integer> triplet = new ArrayList < Integer > () ;

                            triplet.add (nums [i]) ;

                            triplet.add (nums [j]) ;

                            triplet.add(nums [k]);

                            Collections.sort (triplet) ;

                            result.add(triplet);
                        }
                    }
            }
        }
                

            result = new ArrayList<List<Integer>> (new LinkedHashSet<List<Integer>> (result));

            return result;
    }

    public static void main(String[] args) {
        int nums[]={-1,-0,1,2,-1,-4};
        //solution(nums); 
        System.out.println("test case 1: "+threeSum(nums));
        
    }
}
