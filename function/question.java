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


    public static int bicoe(int n,int r){
        int fact_n=fact(n);
        int fact_r=fact(r);
        int fact_nmr=fact(n-r);

        int BC=fact_n/(fact_r*fact_nmr);
        return BC;
    }



    public static boolean isPrime(int n){

        if(n<=1){
            return false;
        }

        for(int i=2;i<=n-1;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    public static boolean isPrimeOpt(int n){

        if(n<=1){
            return false;
        }

        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int n,r;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the n: ");
        n=sc.nextInt();
        /*System.out.print("Enter the r: ");
        r=sc.nextInt();

        System.out.println("Factorial of "+n+" = "+fact(n));

        System.out.println("Binomial coeffiecient: "+bicoe(n,r));*/
        System.out.println(n+" is Prime: "+isPrimeOpt(n));
        
        
        

        
    }


}
