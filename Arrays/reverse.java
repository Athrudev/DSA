package Arrays;

public class reverse {

    public static void swap(int arr[],int a,int b){

        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;

    }

    public static void display(int a[]){
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }


    public static void reverse_array(int a[]){
        int first=0,last=a.length-1;
        while(first<last){
            swap(a,first,last);
            first++;
            last--;
        }
    }
    public static void main(String[] args) {
        int a[]={10,40,50,30,5};
        reverse_array(a);
        display(a);
    }
}
