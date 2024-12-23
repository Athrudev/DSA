package Arrays;

public class pairs {

    public static void print_pairs(int a[]){
        int n=a.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                System.out.print("("+a[i]+","+a[j]+")");            }
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        print_pairs(arr);
    }
}
