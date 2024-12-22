public class diamond {
    public static void main(String args[]){
        int n=4;

        //first half of the pyramid
        for(int i=1;i<=n;i++){


            for(int s=0;s<(n-i);s++){
                System.out.print(" ");
            }

            for(int j=1;j<=(i*2-1);j++){
                System.out.print("*");
            }

            System.out.println("");
        }

        //other half of the pyramid

        for(int i=n;i>=1;i--){


            for(int s=0;s<(n-i);s++){
                System.out.print(" ");
            }

            for(int j=1;j<=(i*2-1);j++){
                System.out.print("*");
            }

            System.out.println("");
        }
    }
}
