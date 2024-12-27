package sort;
import java.util.*;

public class basicSort {

    public static void swapArr(int a[],int i,int j){
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }

    public static void printArr(int a[]){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
            
        }
        System.out.println("");
    }




    public static void bubbleSort(int a[]){
        int n=a.length;

        for(int i=0;i<n-1;i++){
            int swap=0;
            for(int j=0;j<n-1-i;j++){
                if(a[j]>a[j+1]){
                    swapArr(a,j,j+1);
                    swap++;
                }
            }
            if(swap==0 && i==0){
                System.out.println("already sorted");
                break;
            }
        }

    }




    public static void selectionSort(int a[]){
        int n=a.length;

        for(int i=0;i<n-1;i++){
            int minPos=i;
            for(int j=i;j<n;j++){

                if(a[minPos]>a[j]){
                    minPos=j;
                }

            }

            swapArr(a,minPos,i);
        }
    }




public static void insertionSort(int arr[]) {
    for(int i=1; i<arr. length; i++) {
    int curr = arr[i];
    int prev = i-1;

        //finding out the correct pos to insert
        while(prev >=0 && arr[prev] > curr) {
        arr[prev+1] = arr[prev];
        prev --;
        }

    //insertion
    arr[prev+1] = curr;

    }
}

   

    public static void main(String args[]){

        int arr[]={5,2,3,1,4};
        //int a2[]={1,2,3,4,5};
       /*  bubbleSort(arr);
        printArr(arr);
        bubbleSort(a2); */

        //selectionSort(arr);
        //insertionSort(arr);

        //all the above algorithm takes time complexity of O(n^2) which is not optimized algorihtm's

        //inbuilt sorting in java time complexit = O(log n)
        //this method is present in the java.util.Arrays package
        Arrays.sort(arr);
        printArr(arr);


    }
    
}
