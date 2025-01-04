package Strings;

public class fun {
    public static void main(String args[]){
        String s1="abc";
        String s2="abc";
        String s3=new String("abc");


        //output is true
        if(s1 == s2){
            System.out.println(s1+","+s2+" both are equal");            
        }else{
            System.out.println(s1+","+s2+" both are not equal");
        }


        //output is false
        if(s1 == s3){
            System.out.println(s1+","+s3+" both are equal");            
        }else{
            System.out.println(s1+","+s3+" both are not equal");
        }
        //this is happened because when we don't use an new keyword to create an string it will point to some old string with same content
        //but when you create an string with the new keyword it creates an new memory location
        //that's why we use equals() to compare the content of both string's, instead of ==



        //sub string inbuilt function

        String str="HelloWorld";
        System.out.println(str.substring(0,5));
        


    }
}
