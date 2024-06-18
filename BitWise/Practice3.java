public class Practice3 {

    public static int clearIbit(int n, int i){
        int bitMask = ~(1<<i);

        return n & bitMask;
    }
    public static void main(String args[]){
        System.out.println(clearIbit(10, 2));
    }
    
}
