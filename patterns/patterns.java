
public class patterns {

        public static void star_pattern(int n){

            for(int i=1;i<=n;i++){ // to traverse lines
                for(int j=1;j<=i;j++){//to print each line
                    System.out.print("*");
                }
                System.out.println("");
            }

        }


    public static void main(String[] args) {
        int n=5;
        star_pattern(n);
    }
}
