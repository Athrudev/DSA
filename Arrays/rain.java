package Arrays;

public class rain {


    public static void TrappedRainWater(int height[],int width){

        int n=height.length;
        int waterlevel,trappedWater=0;

        //calculate the left max boundery;
        int LeftMaxBoundary[]=new int[n];
        LeftMaxBoundary[0]=height[0];
        for(int i=1;i<n;i++){
            LeftMaxBoundary[i]=Math.max(height[i],LeftMaxBoundary[i-1]);
        }

        //calculate the right max boundary
        int RightMaxBoundary[]=new int[n];
        RightMaxBoundary[n-1]=height[n-1];

        for(int i=n-2;i>=0;i--){
            RightMaxBoundary[i]=Math.max(height[i],RightMaxBoundary[i+1]);
        }

        //loop

        for(int i=0;i<n;i++){
            //water level=min(leftmaxB,rightmaxB)
            waterlevel=Math.min(LeftMaxBoundary[i],RightMaxBoundary[i]);

            //trapped water=water level-height[i]
            trappedWater+=(waterlevel-height[i])*width;
            
        }
        System.out.println("Total trapper water is: "+trappedWater);
    }


    public static void main(String args[]){
        int height[]={4,2,0,6,3,2,5};
        int width=1;
        TrappedRainWater(height,width);


    }
}
