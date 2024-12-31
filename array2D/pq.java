package array2D;

public class pq {


    //Question 1: Print the number of 7's that are in the 2d array.
    public static int search_num(int a[][],int num){
        int c=0;
        int n=a.length,m=a[0].length;


        //brute force approach
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(a[i][j]==num){
                    c++;
                }
            }
        }
        return c;

    }

    public static void main(String[] args) {
        int a[][]={{4,7,8},
                {8,8,7}};

        System.out.println(search_num(a, 7));  // output = 2          
       
            
        
    }
}
