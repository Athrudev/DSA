package array2D;
import java.util.*;

public class question {

    public static void spiralArray(int a[][]){

        int n=a.length,m=a[0].length;

        int StartRow=0;
        int EndRow=n-1;
        int StartCol=0;
        int EndCol=m-1;


        while(StartRow<=EndRow && StartCol<=EndCol){

            //i=row
            //j=column

            //top
            for(int j=StartCol;j<=EndCol;j++){
                System.out.print(a[StartRow][j]+" ");
                
            }

            //right

            for(int i=StartRow+1;i<=EndRow;i++){
                System.out.print(a[i][EndCol]+" ");
            }
            

            //bottom

            for(int j=EndCol-1;j>=StartCol;j--){
                System.out.print(a[EndRow][j]+" ");   
            }
            
            //left

            for(int i=EndRow-1;i>=StartRow+1;i--){
                System.out.print(a[i][StartCol]+" ");
                
            }
            //System.out.println();
            
            StartRow++;
            StartCol++;
            EndCol--;
            EndRow--;
        }
    }



    public static void displayArray(int a[][]){
        int n=a.length,m=a[0].length;

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(a[i][j]+"\t");
                
            }
            System.out.println();
        }
    }





    public static int DiagonalSum(int a[][]){

        int n=a.length;
        int m=a[0].length;

        int sum=0;

        //this is brute force approach
        /* for(int i=0;i<n;i++){ //this takes time complexity of O(n^2)
            for(int j=0;j<m;j++){
                if(i==j){ // condition for primary diagonal
                    sum+=a[i][j];
                }

                else if((i+j)==n-1){  //condition for secondary diagonal
                    sum+=a[i][j];
                }
            }
        } */


        //optimized approach
        //this approach takes time complexity of O(n^2)
        for(int i=0;i<n;i++){
            //primary diagonal
            sum+=a[i][i];

            //secondary diagonal
            if(i!=n-1-i)
                sum+=a[i][n-i-1];
        }

        return sum;
    }



    public static boolean staircaseSearch(int a[][],int key){
        int n=a.length,m=a[0].length;
        int row=0;
        int col=m-1;

        while(row<n && col>=0){
            if(a[row][col]==key){
                System.out.println("Found at place: ("+row+","+col+")");
                return true;
                
            }else if(key<a[row][col]){
                col--;
            }else{
                row++;
            }
        }

        System.out.println("Element not found");
        return false;
        
    }

    public static void main(String[] args) {

        int matrix[][]={{1,2,3,4},
                          {5,6,7,8},
                        {9,10,11,12},
                    {13,14,15,16}};
        
        Scanner sc=new Scanner(System.in);


        System.out.println("original Matrix:");
        displayArray(matrix);

        System.out.println("\n\nSpiral Matrix:");
        spiralArray(matrix);
        

        System.out.println("\n\nDiagonal sum:"+DiagonalSum(matrix));


        int key;
        System.out.println("Enter key to be search:");
        key=sc.nextInt();
        

        System.out.println(staircaseSearch(matrix,key));
        
        
        
        
    }
}
