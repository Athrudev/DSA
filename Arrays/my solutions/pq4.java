package Arrays;
import java.util.*;


public class pq4 {

    public static int solution(int h[]){

        int n=h.length;
        //calculate left max boundary

        int leftMaxB[]=new int[n];
        leftMaxB[0]=h[0];

        for(int i=1;i<n;i++){
            leftMaxB[i]=Math.max(h[i],leftMaxB[i-1]);
        }


        //calculate right max boundary
        int rigthMaxB[]=new int[n];
        rigthMaxB[n-1]=h[n-1];

        for(int i=n-2;i>=0;i--){
            rigthMaxB[i]=Math.max(h[i],rigthMaxB[i+1]);
        }

        //loop
        int trappedWater=0;
        for(int i=0;i<n;i++){
            //water level=min(leftmaxb,rightmaxb)
            int waterLevel=Math.min(leftMaxB[i],rigthMaxB[i]);
            /* System.out.println(leftMaxB[i]);
            System.out.println(rigthMaxB[i]); */
            
            //trapped water+=waterlevel-h[i]
            trappedWater+=waterLevel-h[i];
        }

        //return trappedwater
        return trappedWater;

    }


    public static void main(String[] args) {

        int height1[]={0,1,0,2,1,0,1,3,2,1,2,1};
        int height2[]={4,2,0,3,2,5};

        System.out.println("test case 1: "+solution(height1) );
        System.out.println("test case 2: "+solution(height2) );
        
        
    }
}
