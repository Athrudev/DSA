package sort;

public class basicSort {

    public static void swap(int a[],int i,int j){
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }

    public static void bubbleSort(int a[]){
        int n=a.length;

        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1-i;j++){
                if(a[j]>a[j+1]){
                    swap(a,j,j+1);
                }
            }
        }

    }

    public static void printArr(int a[]){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
            
        }
        System.out.println("");
    }

    public static void main(String args[]){

        int arr[]={5,2,3,1,4};
        bubbleSort(arr);
        printArr(arr);


    }
    
}
