package Strings;

public class q {


    public static float shortestPath(String s){
        int n=s.length();
        char dir;
        int x=0,y=0;

        for(int i=0;i<n;i++){
            dir=s.charAt(i);

            //north
            if(dir=='N'){
                y++;
            }
            
            //south
            else if(dir == 'S'){
                y--;
            }
            //East
            else if(dir == 'E'){
                x++;
            }
            //west
            else{
                x--;
            }
        }

        int X2=x*x;
        int Y2=y*y;
        return (float)(Math.sqrt(X2+Y2));
    }

    public static String largestString(String s[]){
        int n=s.length;
        String large=s[0];

        for(int i=0;i<n;i++){
            if(s[i].compareToIgnoreCase(large)>0){
                large=s[i];
            }
        }
        return large;
    }


    public static String FirstLetterCapital(String s){
        int n=s.length();
        StringBuilder sb=new StringBuilder("");

        char c=s.charAt(0);
        sb.append(Character.toUpperCase(c));

        for(int i=1;i<n;i++){

            if(s.charAt(i)==' ' && i<n-1){
                sb.append(s.charAt(i));
                i++;
                
                sb.append(Character.toUpperCase(s.charAt(i)));
            }else{
                sb.append(s.charAt(i));
            }
        }

        return sb.toString();

    }


    public static String compress(String s){
        StringBuilder newStr=new StringBuilder("");
        int n=s.length();

        for(int i=0;i<n;i++){
            int c=1;
            while( i<n-1 && s.charAt(i)==s.charAt(i+1)){
                c++;
                i++;
            }
            newStr.append(s.charAt(i));
            if(c>1){
                newStr.append(c);
            }
        }

        return newStr.toString();
    }


    public static void main(String args[]){
       /*  String path="WNEENEENNN";
        String path2="NS";
        System.out.println("Shortest path: "+shortestPath(path));
        System.out.println("Shortest path: "+shortestPath(path2));
         */


        /* String f[]={"apple","mango","banana"};
        System.out.println("Largest is: "+largestString(f)); */


        /* String s="hi, i am Atharva";
        System.out.println(s);
        
        System.out.println(FirstLetterCapital(s)); */


        String s="aaabbcccc";
        System.out.println(compress(s));
        
        
        
    }
}
