import java.util.*;

public class srhombus {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of lines: ");
        int n=sc.nextInt();

        for(int i=1;i<+n;i++){
            for(int s=0;s<(n-i);s++){
                System.out.print(" ");
            }

            for(int j=1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
