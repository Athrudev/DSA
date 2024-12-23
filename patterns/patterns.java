
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


        public static void char_pyramid(int n){
            char ch='A';
            for(int i=1;i<=n;i++){
                for(int j=1;j<=i;j++){
                    System.out.print(ch);
                    ch++;
                }
                System.out.println("");
            }
        }


        public static void zero_one(int n){
            for(int i=1;i<=n;i++){
                for(int j=1;j<=i;j++){
                    if((i+j)%2==0){
                        System.out.print("1");
                    }else{
                        System.out.print("0");
                    }
                }
                System.out.println("");
            }
        }


    public static void main(String[] args) {
        int n=5;
        System.out.println("\n1.Star pattern\n");
        star_pattern(n);
        System.out.println("\n2.Inverted Star pattern\n");
        inverted_star_patten(n);
        System.out.println("\n3.Half pyramid number pattern\n");
        half_pyramid_no(n);
        System.out.println("\n4.Half pyramid character pattern\n");
        char_pyramid(n);
        System.out.println("\n4.zero one pattern\n");
        zero_one(n);
    }
}
