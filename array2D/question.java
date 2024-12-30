package array2D;
import java.util.*;

public class spiral {

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

    public static void main(String[] args) {

        int matrix[][]={{1,2,3,4},
                          {5,6,7,8},
                        {9,10,11,12},
                    {13,14,15,16}};

        System.out.println("original Matrix:");
        displayArray(matrix);

        System.out.println("\n\nSpiral Matrix:");
        spiralArray(matrix);
        
        
        
    }
}
