import java.util.*;
public class halfpyramid{
    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter no lines: ");

        int n=sc.nextInt();

        for(int i=1;i<=n;i++){ // outer loop to loop entire lines
            for(int j=1;j<=i;j++){ // this loop to print each line
                System.out.print("*");
               /* 5 System.out.print("i: "+i);
                System.out.print("j: "+j);*/

            }
            System.out.println();
        }

        sc.close();

    }

}