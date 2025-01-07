package Strings;

public class pq {



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


    public static void main(String[] args) {

        System.out.println(vowelCount("Atharva")); //output = 10
        
        
    }
}
