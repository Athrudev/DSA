package Strings;

public class basics{
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
        
    }
}