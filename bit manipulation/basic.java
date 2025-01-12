import java.util.*;

public class basic{
    public static void main(String args[]){
        int a,b;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();

        System.out.println(a+" & "+b+" :"+(a&b));
        System.out.println(a+" | "+b+" :"+(a|b));
        System.out.println(a+" ^ "+b+" :"+(a^b));
        System.out.println("~"+a+" :"+(~a));
        
    }
}