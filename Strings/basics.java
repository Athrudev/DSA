package Strings;

public class basics{

    public static void printLetters(String s){
        for(int i=0;i<s.length();i++){
            System.out.print(s.charAt(i)+" ");
        }

        System.out.println();
        
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
        
    }
}