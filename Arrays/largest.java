package Arrays;
import java.util.*;

public class largest {


    public static int getLargest(int arr[]){
        int largest=Integer.MIN_VALUE; //it shows - infinity, same there is a MAX_VALUE that shows the +infinity
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        int arr[]=new int[20];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array element's (5)");
        for(int i=0;i<5;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Largest element in the array: "+getLargest(arr));
    }
}
