package Strings;
import java.lang.reflect.Array;
import java.util.*;
public class pq {


    //Question 1: count how mnay times a vowel is occured at the string
    public static int vowelCount(String s){
        int c=0;
        int n=s.length();
        for(int i=0;i<n;i++){

            if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u'){
                c++;
            }

        }
        return c;
    }

    public static boolean isAnagram(String s1,String s2){

        s1=s1.toLowerCase();
        s2=s2.toLowerCase();
        
        //1. check if length is correct or not
        if(s1.length()==s1.length()){
            //.convert to array
            char c1[]=s1.toCharArray();
            char c2[]=s2.toCharArray();

            //sort both the string
            Arrays.sort(c1);
            Arrays.sort(c2);

            //compare both with array.equals() method
            boolean res=Arrays.equals(c1,c2);
            return res;
        }
        return false;
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(vowelCount("Atharva")); //output = 10
        System.out.println("Enter the first string");
        String s1=sc.nextLine();

        System.out.println("Enter the second string");
        String s2=sc.nextLine();
        
        System.out.println("is anagram: "+isAnagram(s1,s2));



        
        
    }
}
