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
        
        
    }



    public static void print_pairs(int a[]){
        int n=a.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                System.out.print("("+a[i]+","+a[j]+")");
            }
            System.out.println("");
        }
    }


    public static void print_sub_arrays(int a[]){
        int n=a.length;
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


        System.out.println("Maximum sum of an sub array is:"+ms);
    }



    public static void prefix_approach_sum(int a[]){
        int n=a.length;
        int cs=0;
        int ms=Integer.MIN_VALUE;
        

    }



    public static void main(String[] args) {

        int a[]={2,4,6,8,10};
        //int a2[]={};

        //reverse_array(a);
        //print_pairs(a);
        //print_sub_arrays(a);
        //brute_force_approach_max_subarray(a);
        prefix_approach_sum(a);

        
    }
}
