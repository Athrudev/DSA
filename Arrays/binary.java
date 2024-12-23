package Arrays;
import java.util.*;

public class binary {

    public static void search(int arr[],int key){

        int start=0;
        int end=arr.length-1;
        //int mid=(start+end)/2;
        boolean found=false;

        for(int i=0;i<arr.length;i++){
            int mid=(start+end)/2;
            if(key==arr[mid]){
                found=true;
                break;
            }else if(arr[mid]>key){
                end=mid-1;
            }else if(arr[mid]<key){
                start=mid+1;
                
            }
            
        }

        if(found){
            System.out.println("Element found");
        }else{
            System.out.println("Not found");
        }


    }


    public static void sort(int arr[]){

        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }

    }


    public static void display(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[5];
        System.out.println("Enter the array element's (5): ");
        for(int i=0;i<5;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Enter the key to search:");
        int key=sc.nextInt();

        sort(arr);
        display(arr);
        search(arr,key);
    }   
}
