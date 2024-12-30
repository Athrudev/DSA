package array2D;
import java.util.*;

public class basic {

    public static boolean search(int a[][],int key){

        int n=a.length,m=a[0].length;

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(a[i][j]==key){
                    System.out.println(key+" found at cell: ("+i+","+j+")");
                    
                    return true;
                }
            }
        }
        return false;
    }


    public static void displayArray(int a[][]){
        int n=a.length;
        int m=a[0].length;

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print (a[i][j]+" ");
                
            }
            System.out.println();
            
        }
    }

    public static void main(String args[]){
        int matric[][]=new int[3][3];
        int n=matric.length; //row
        int m=matric[0].length; //column

        //System.out.println("Enter matrix element (9)");
        Scanner sc=new Scanner(System.in);
        int val=1;

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matric[i][j]=val;
                val++;
            }
        }

        System.out.println("matrix element's are:\n");
        displayArray(matric);

        System.out.println("\n");

        search(matric, 5);
        search(matric, 7);
        search(matric, 9);
        search(matric, 1);
        
        
        //search(matric,9);
        sc.close();

        //Arrays.sort(matric);

    }
    
}
