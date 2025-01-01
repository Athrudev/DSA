package array2D;

public class pq {



    public static void displayArray(int a[][]){
        int n=a.length,m=a[0].length;

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(a[i][j]+"\t");
                
            }
            System.out.println();
        }
    }


    //time complexity = O(n^2)
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

    //time complexity = O(n)
    //question 2: Print out the sum of the numbers in the second row of the "nums" array.
    public static int sum_rows(int a[][],int row){

        int sum=0;
        int i=row-1;
        int n=a[0].length;
        for(int j=0;j<n;j++){            
            sum+=a[i][j];
        }
        return sum;

    }


    //time complexity = O(n^2)
    //question 3: write a program to find a transpose of a matrix
    public static void transpose(int a[][]){
        int n=a.length,m=a[0].length;
        int trans[][]=new int[m][n];

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                trans[j][i]=a[i][j];
            }
        }

        displayArray(trans);
    }



    public static void main(String[] args) {
        int a[][]={{4,7,8},
                {8,8,7}};
        int a2[][]={{1,4,9},
                    {11,4,3},
                    {2,2,3}};

        int a3[][]={{11,12,13},
                    {21,22,23}};

        System.out.println(search_num(a, 7));  // output = 2     
        System.out.println(sum_rows(a2,2)); //18
        transpose(a3);
             
       
            
        
    }
}
