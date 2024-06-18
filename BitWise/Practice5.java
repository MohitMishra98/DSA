public class Practice5 {

    public static int clearLastIBits(int n, int i){
        int bitMask = -1<<i;
        return n & bitMask;
    }
    public static void main(String args[]){
        System.out.println(clearLastIBits(15, 5));
    }
    
}
