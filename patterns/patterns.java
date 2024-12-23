
public class patterns {

        public static void star_pattern(int n){

            for(int i=1;i<=n;i++){ // to traverse lines
                for(int j=1;j<=i;j++){//to print each line
                    System.out.print("*");
                }
                System.out.println("");
            }

        }


        public static void inverted_star_patten(int n){
            for(int i=n;i>=1;i--){
                for(int j=1;j<=i;j++){
                    System.out.print("*");
                }
                System.out.println("");
            }
        }


        public static void half_pyramid_no(int n){
            for(int i=1;i<=n;i++){
                for(int j=1;j<=i;j++){
                    System.out.print(j);
                }
                System.out.println("");
            }
        }


    public static void main(String[] args) {
        int n=5;
        System.out.println("\nStar pattern\n");
        star_pattern(n);
        System.out.println("\nInverted Star pattern\n");
        inverted_star_patten(n);
        System.out.println("\nHalf pyramid number pattern\n");
        half_pyramid_no(n);
    }
}
