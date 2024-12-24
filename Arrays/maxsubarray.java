package Arrays;
import java.util.*;


//this is brute force approach it has time complexity of O(n^3)
//we have another approach like prefix sum to solve this problem

public class maxsubarray {


    public static void print_max_subarray(int a[]){
        int n=a.length;
        int cs=0;
        int max=Integer.MIN_VALUE;

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                cs=0;
                for(int k=i;k<=j;k++){
                    cs+=a[k];
                }
                if(cs>max){
                    max=cs;
                }
                System.out.println(cs);
            }
            
        }
        System.out.println(max);
    }


    public static void main(String args[]){
        int a[]={2,4,6,8,10};
        print_max_subarray(a);
    }
}
