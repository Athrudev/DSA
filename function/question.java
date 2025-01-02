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

    //this is optimized approach for finding the prime of an number
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



    public static void PrimeInRange(int n){

        for(int i=2;i<=n;i++){
            if(isPrimeOpt(i)){
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }



    public static void binToDec(int binNum){
        int pow=0;
        int dec=0;

        int myNum=binNum;

        while(binNum>0){
            int ld=binNum%10; //to findout the last digit
            dec+=ld*((int)Math.pow(2,pow)); //dec=last digit * 2^0;

            pow++;
            binNum=binNum/10; // remove the last digit from the binary number e.g. 101->10

        }

        System.out.println("binary of "+myNum+" = "+dec);
        
    }


    public static void decToBin(int n){
        int pow=0;
        int bin=0;
        int temp=n;

        while(n>0){
            int rem=n%2;
            bin+=rem*((int)Math.pow(10,pow));
            pow++;
            n=n/2;
        }

        System.out.println("Decimal of "+temp+" = "+bin);
        
    }

    public static void main(String[] args) {
        int n,r;
        Scanner sc=new Scanner(System.in);
        /* System.out.print("Enter the n: ");
        n=sc.nextInt();
        System.out.print("Enter the r: ");
        r=sc.nextInt();

        //System.out.println("Factorial of "+n+" = "+fact(n));

        System.out.println("Binomial coeffiecient: "+bicoe(n,r));
        System.out.println(n+" is Prime: "+isPrimeOpt(n));

       System.out.println("All the prime numbers in the range are:");
       PrimeInRange(n); */


       binToDec(1010);
       decToBin(12);
       
        
        
        

        
    }


}
