import java.util.*;

public class inverted {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of lines: ");
        int n=sc.nextInt();

        for(int i=n;i>=1;i--){
            for(int j=i;j>=1;j--){
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
