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

    public static void main(String[] args) {

        int a[]={2,4,6,8,10};

        reverse_array(a);

        
    }
}
