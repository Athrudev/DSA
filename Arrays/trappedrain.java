package Arrays;
import java.util.*;

import java.util.*;
public class trappedrain{

    public static int trappedRainWater(int height[],int width){

        int n=height.length;
        //calculate left max boundary
        //left max boundary will start from the left side and will go to the last building
        int leftMaxB[]=new int[n];
        leftMaxB[0]=height[0];
        for(int i=1;i<n;i++){
            leftMaxB[i]=Math.max(leftMaxB[i-1],height[i]);
        }

        //calculate right max boundary
        //right max boundary will start from the last building to the first building

        int rightMaxB[]=new int[n];
        rightMaxB[n-1]=height[n-1];

        for(int i=n-2;i>=0;i--){
            rightMaxB[i]=Math.max(rightMaxB[i+1],height[i]);
        }



        //loop
        int trappedWater=0;
        for(int i=0;i<n;i++){
            //water level=min(leftmaxb,rightmaxboundary)
            int waterLevel=Math.min(leftMaxB[i],rightMaxB[i]);

            //trapped water=(water level-height[i] )* width //height of the current building
            trappedWater+=(waterLevel-height[i])*width;
        }

        return trappedWater;
    }

    public static void main(String args[]){
        int height[]={4,2,0,6,3,2,5};
        int width=1;

        System.out.println("total trapped rain water is:"+trappedRainWater(height,width));
    }

}