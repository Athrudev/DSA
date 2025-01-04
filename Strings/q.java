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


    public static void main(String args[]){
        String path="WNEENEENNN";
        String path2="NS";
        System.out.println("Shortest path: "+shortestPath(path));
        System.out.println("Shortest path: "+shortestPath(path2));
        
    }
}
