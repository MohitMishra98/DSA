public class Practice4 {

    public static int setIbit(int n, int i){
        int bitMask = 1<<i;

        return n | bitMask;
    }

    public static int clearIbit(int n, int i){
        int bitMask = ~(1<<i);

        return n & bitMask;
    }

    public static int updateIbit(int n, int i, int newBit){
        // if(newBit == 0){
        //     return clearIbit(n, i);
        // } else {
        //     return setIbit(n, i);
        // }

        n = clearIbit(n, i);
        int bitMask = newBit<<i;
        return n | bitMask;
    }


    public static void main(String args[]){
        System.out.println(updateIbit(10, 2, 1));
    }
    
}
