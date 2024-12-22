public class butterfly {
    public static void main(String[] args) {
        int n=4;


        //this is first half of the butterfly
        for(int i=1;i<=n;i++){

            //first star
            for(int star=1;star<=i;star++){
                System.out.print('*');
            }

            //space

            for(int j=1;j<=(n-i)*2;j++){
                System.out.print(" ");
            }

            //Second star
            for(int star=1;star<=i;star++){
                System.out.print('*');
            }

            System.out.println("");

        }



        //this is Second half of the butterfly
        for(int i=n;i>=1;i--){

            //first star
            for(int star=1;star<=i;star++){
                System.out.print('*');
            }

            //space

            for(int j=1;j<=(n-i)*2;j++){
                System.out.print(" ");
            }

            //Second star
            for(int star=1;star<=i;star++){
                System.out.print('*');
            }

            System.out.println("");

        }

    }
}
