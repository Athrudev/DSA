public class q {

    public static void OddorEven(int n){
        int bitMask=1;
        if((n&bitMask)==0){
            System.out.println(n+" is Even number");
        }else{
            System.out.println(n+" is Odd number");
        }

    }


    public static int getIthBit(int n,int i){
        int bitMask=(1<<i);
        if((n&bitMask)==0){
            return 0;
        }else{
            return 1;
        }
    }



    public static int setIthBit(int n,int i){
        int bitMask=(1<<i);
        return n|bitMask;
    }

    public static int clearIthBit(int n,int i){
        int bitMask=~(1<<i);
        return n & bitMask;
    }


    public static int updateIthBit(int n,int i,int newBit){
        if(newBit==0){
            return clearIthBit(n, i);
        }else{
            return setIthBit(n, i);
        }
    }


    public static int clearIBits(int n,int i){
        int bitMask=(~0)<<i;
        return n & bitMask;
    }

    public static int clearBitsInRange(int n,int i,int j){
        int a=(~0)<<(j+1);
        int b=(1<<i)-1;
        int bitMask=a|b;
        return n & bitMask;
    }


    public static boolean isPowerOfTwo(int n){

    //this is the property of an binary system n is power of two when = n & n-1 is '0';
    

        if((n & (n-1))==0){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
       /*  OddorEven(3);
        OddorEven(4);
        OddorEven(480);
        OddorEven(109);

        System.out.println(getIthBit(10, 3));
        System.out.println(setIthBit(10, 2));
        System.out.println(clearIthBit(10, 1));
        System.out.println(updateIthBit(10, 2, 1));
        System.out.println(clearIBits(15, 2));
        System.out.println(clearBitsInRange(10, 2,4)); */
        System.out.println("4:"+isPowerOfTwo(4));
        System.out.println("9:"+isPowerOfTwo(9));
        System.out.println("12:"+isPowerOfTwo(12));
        System.out.println("16:"+isPowerOfTwo(16));
        
        
        
    }
}
