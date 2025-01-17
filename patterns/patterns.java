
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



        public static void hollow_rect(int n){
            for(int i=1;i<=n;i++){
                for(int j=1;j<=n;j++)
                {
                    if(i==1 || i==n || j==1 || j==n){

                        System.out.print("*");

                    }else{
                        System.out.print(" ");
                    }
                }
                System.out.println("");
            }
        }


        public static void rhombus(int n){
            for(int i=1;i<=n;i++){

                //for spaces
                for(int s=1;s<=(n-i);s++){
                    System.out.print(" ");
                }

                //for printing star
                for(int j=1;j<=n;j++){
                    System.out.print("*");
                }
                //for next line
                System.out.println("");
            }
        }


        public static void hollow_rhombus(int n){
            for(int i=1;i<=n;i++){

                for(int s=1;s<=(n-i);s++){
                    System.out.print(" ");
                }


                for(int j=1;j<=n;j++){
                    if(i==1 || j==1 || i==n || j==n){
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                }

                System.out.println("");
            }
        }

        public static void diamond(int n){

            //first half of the diamond
            for(int i=1;i<=n;i++){
                
                for(int s=1;s<=(n-i);s++){
                    System.out.print(" ");
                }

                for(int j=1;j<=(2*i)-1;j++){
                    System.out.print("*");
                }

                System.out.println("");
            }



            //Second half of the diamond
            for(int i=n;i>=1;i--){
                
                for(int s=1;s<=(n-i);s++){
                    System.out.print(" ");
                }

                for(int j=1;j<=(2*i)-1;j++){
                    System.out.print("*");
                }

                System.out.println("");
            }
        }





        public static void butterfly(int n){

            //first half of the pattern
            for(int i=1;i<=n;i++){
                for(int j=1;j<=i;j++){
                    System.out.print("*");
                }


                for(int s=1;s<=(n-i)*2;s++){
                    System.out.print(" ");
                }

                for(int j=1;j<=i;j++){
                    System.out.print("*");
                }

                System.out.println("");
            }


            //Second half of the problem

            for(int i=n;i>=1;i--){
                for(int j=1;j<=i;j++){
                    System.out.print("*");
                }


                for(int s=1;s<=(n-i)*2;s++){
                    System.out.print(" ");
                }

                for(int j=1;j<=i;j++){
                    System.out.print("*");
                }

                System.out.println("");
            }
        }





        public static void floyds_trianlge(int n){
            int c=1;
            for(int i=1;i<=n;i++){
                for(int j=1;j<=i;j++){
                    System.out.print(c+" ");
                    c++;
                }

                System.out.println("");
            }
        }


        public static void inverted_number(int n){

            for(int i=n;i>=1;i--){
                for(int j=1;j<=i;j++){
                    System.out.print(j);
                }
                System.out.println("");
            }
        }

        public static void inverted_rotated_number(int n){

            for(int i=n;i>=1;i--){

                for(int s=1;s<=(n-i);s++){
                    System.out.print(" ");
                }

                for(int j=1;j<=i;j++){
                    System.out.print(j);
                }
                System.out.println("");
            }
        }






        //bonus pattern

        public static void number_pyrmaid(int n){
            for(int i=1;i<=n;i++){


                for(int s=1;s<=(n-i);s++){
                    System.out.print(" ");
                }

                int num=i;


                for(int j=1;j<=i;j++){
                    System.out.print(num+" ");
                }
                System.out.println("");
            }
        }


        public static void palindromic_number_pyramid(int n){

            for(int i=1;i<=n;i++){

                //spaces
                for(int s=1;s<=(n-i);s++){
                    System.out.print(" ");
                }
                 
                //descending
                for(int k=i;k>=1;k--){
                    System.out.print(k);
                }

                //ascending
                for(int k=2;k<=i;k++){
                    System.out.print(k);
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
        System.out.println("\n5.zero one pattern\n");
        zero_one(n);
        System.out.println("\n6.Hollow Rectangle\n");
        hollow_rect(n);
        System.out.println("\n7.Solid rhombus\n");
        rhombus(n);
        System.out.println("\n8.hollow rhombus\n");
        hollow_rhombus(n);
        System.out.println("\n9.Diamond\n");
        diamond(n); 
        System.out.println("\n10.Butterfly\n");
        butterfly(n);
        System.out.println("\n11.Floyds pattern\n");
        floyds_trianlge(n);
        System.out.println("\n12.inverted number pattern\n");
        inverted_number(n);
        System.out.println("\n13.Inverted Rotated Number\n");
        inverted_rotated_number(n);
        System.out.println("\n14.Number Pyramid\n");
        number_pyrmaid(n);

        System.out.println("\n15.Palindromic number pyramid\n");
        palindromic_number_pyramid(n);



    }
}
