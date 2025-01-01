package function;
import java.util.*;

public class question {

    public static int fact(int n){

        int fact=1;
        for(int i=1;i<=n;i++){
            fact*=i;
        }

        return fact;

    }
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        n=sc.nextInt();

        System.out.println("Factorial of "+n+" = "+fact(n));
        
        

        
    }


}
