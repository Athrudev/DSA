public class q {

    public static void OddorEven(int n){
        int bitMask=1;
        if((n&bitMask)==0){
            System.out.println(n+" is Even number");
        }else{
            System.out.println(n+" is Odd number");
        }

    }

    public static void main(String[] args) {
        OddorEven(3);
        OddorEven(4);
        OddorEven(480);
        OddorEven(109);
    }
}
