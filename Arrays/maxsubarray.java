package Arrays;
import java.util.*;



public class maxsubarray {
    
    //this is brute force approach it has time complexity of O(n^3)
    //we have another approach like prefix sum to solve this problem

    public static void brute_force_approach(int a[]){
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
           }
            
        }
        System.out.println(max);
    }


    public static void prefix_sum_approach(int a[]){

        int n=a.length;
        int cs=0;
        int max=Integer.MIN_VALUE;
        int prefix[]=new int[n];

        prefix[0]=a[0];

        for(int i=1;i<n;i++){
            prefix[i]=prefix[i-1]+a[i];
        }

        for(int i=0;i<n;i++){
            int start=i;
            for(int j=i+1;j<n;j++){
                int end=j;

                /* for(int k=i;k<=j;k++){
                    cs+=a[k];
                } */

                cs=start==0 ? prefix[end] : prefix[end]-prefix[start-1];


                if(cs>max){
                    max=cs;
                }
          }
            
        }
        System.out.println(max);


    }

    public static void main(String args[]){
        int a[]={2,4,6,8,10};
        brute_force_approach(a);
        prefix_sum_approach(a);
    }
}
