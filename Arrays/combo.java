package Arrays;
import java.util.*;

public class combo {

        //helper function
    public static void swap(int a[],int i,int j){

        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;

    }




    public static void reverse_array(int a[]){
        int n=a.length;
        int f=0,l=n-1;
        while(f<l){
            swap(a,f,l);
            f++;
            l--;
        }
        

        System.out.println("Reverse of an array is:");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println("");
  
    }



    public static void print_pairs(int a[]){
        int n=a.length;
        System.out.println("all possible pairs in the array:");
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                System.out.print("("+a[i]+","+a[j]+")");
            }
            System.out.println("");
        }
    }


    public static void print_sub_arrays(int a[]){
        int n=a.length;
        System.out.println("all possible subarray in the array:");
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int k=i;k<=j;k++){
                    System.out.print(k+" ");
                }
                System.out.println("");
            }
            System.out.println("");
        }
    }

    //this is a brute force approach for finding the max sum of an sub array
    //this appraoch takes O(n^3) time complexity
    public static void brute_force_approach_max_subarray(int a[]){
        int n=a.length;
        int cs=0;
        int ms=Integer.MIN_VALUE;

        for(int i=0;i<n;i++){//for each number
            for(int j=i+1;j<n;j++){//for sub array of each number
                cs=0;
                for(int k=i;k<=j;k++){
                    cs+=a[k];
                }
                ms=Math.max(ms, cs);
            }
            
        }


        System.out.println("Maximum sum of an sub array using brute force approach:"+ms);
    }


    //this is an prefix approach this takes O(n^2) time complexity
    public static void prefix_approach_sum(int a[]){
        int n=a.length;
        int cs=0;
        int ms=Integer.MIN_VALUE;

        int prefix[]=new int[n];
        prefix[0]=a[0];
        for(int i=1;i<n;i++){
            prefix[i]=prefix[i-1]+a[i];
        }


        for(int i=0;i<n;i++){
            int start=i;
            for(int j=i+1;j<n;j++){
                int end=j;
                cs=start==0 ? prefix[end] : prefix[end]-prefix[start-1];
            }
            ms=Math.max(ms,cs);
        }
        System.out.println("Max sum of an subarray using prefix approach: "+ms);

    }


    public static void kedans_approach(int a[]){
        int n=a.length;
        int cs=0;
        boolean negative=true;
        int ms=Integer.MIN_VALUE;
        int min=Integer.MIN_VALUE;

        for(int i=0;i<n;i++){
            if(a[i]>=0){
                negative=false;
            }
            min=Math.max(min,a[i]);
        }
        if(negative){
                System.out.println("Max sum of an subarray using kedan's algorithm (all negative):"+min);
        }
        if(!negative){
            for(int i=0;i<n;i++){
                cs=cs+a[i];
                if(cs<0){
                    cs=0;
                }
                ms=Math.max(cs,ms);
            }
            System.out.println("Max sum of an subarray using kedan's algorithm:"+ms);
        }
        
    }



    public static void main(String[] args) {

        int a[]={2,4,6,8,10};
        int a2[]={-1,-2,-3,-4};

        reverse_array(a);
        print_pairs(a);
        print_sub_arrays(a);
        brute_force_approach_max_subarray(a);
        prefix_approach_sum(a);
        kedans_approach(a);
        kedans_approach(a2);//for all negative members

        
    }
}
