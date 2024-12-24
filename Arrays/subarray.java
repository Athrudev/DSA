package Arrays;

public class subarray{

    public static void print_sub_array(int a[]){
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                for(int k=i;k<=j;k++){
                    System.out.print(a[k]+" ");
                }
                System.out.println("");
            }
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        print_sub_array(a);
    }
}