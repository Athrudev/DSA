import java.util.*;

public class basic{
    public static void main(String args[]){
        int a,b;
        Scanner sc=new Scanner(System.in);

        System.out.print("\na: ");        
        a=sc.nextInt();

        System.out.print("\nb: ");
        b=sc.nextInt();

        System.out.println(a+" & "+b+" :"+(a&b)); //this is AND operation
        System.out.println(a+" | "+b+" :"+(a|b)); //this is OR operation
        System.out.println(a+" ^ "+b+" :"+(a^b)); //this is XOR operation
        System.out.println("~"+a+" :"+(~a)); //this is one's complement

        sc.close();
        
    }
}