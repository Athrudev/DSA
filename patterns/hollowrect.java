import java.util.*;
public class hollowrect {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int row,cols;
        System.out.print("Enter no of rows: ");
        row=sc.nextInt();
        System.out.print("Enter no of columns: ");
        cols=sc.nextInt();


        for(int i=1;i<=row;i++){
            for(int j=1;j<=cols;j++){
                //cell = (i,j)

                if(i==1 || i==row || j==1 || j==cols){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
        sc.close();
    }
}
