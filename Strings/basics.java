package Strings;

public class basics{

    public static void printLetters(String s){
        for(int i=0;i<s.length();i++){
            System.out.print(s.charAt(i)+" ");
        }

        System.out.println();
        
    }


    //this function has the time complexity of O(n)
    public static boolean isPal(String s){
       // System.out.println("Checking string: " + s);
        String temp="";
        for(int i=s.length()-1;i>=0;i--){
        temp+=s.charAt(i);
        }


    //we can't use an == for the string comparison because, it compares the refrance for an object
    /* if(temp==s){
        return true;
    } */

    if(temp.equals(s)){
        return true;
    }
    return false;
}


    public static boolean isPalindrome(String s){
        int n=s.length();
        for(int i=0;i<n/2;i++){

            if(s.charAt(i)!=s.charAt(n-i-1)){
                //not a palindrome condition
                return false;
            }

        }

        return true;

    }
    public static void main(String[] args) {
        char c[]={'a','b','v'};
        String s ="abcd";
        String s2=new String("xyz");

        //there is a small diffrence between this two in implimentation level
        //java string's are immutable

        String name="Atharva Kamble";
        System.out.println("length of an string is: "+name.length());
        //in string length is an function that's why there is an parenthesis in the end
        //in arrary, length is an property of an array that's why we don't use parenthesis

        //concatenation
        String fname="Atharva";
        String lname="Kamble";
        String fullname=fname+" "+lname;
        System.out.println(fullname);
        
        //we can use the charAt() function to access an each element of an string

        printLetters(fullname);

        String pal="noon";
        System.out.println(pal+" is palindrome: "+isPal(pal));
        System.out.println(pal+" is palindrome (optimized code): "+isPalindrome(pal));
        

        
    }
}