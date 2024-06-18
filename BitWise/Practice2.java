public class Practice2 {

    public static int setIbit(int n, int i){
        int bitMask = 1<<i;

        return n | bitMask;
    }
    public static void main(String args[]){
        System.out.println(setIbit(10, 2));
    }
    
}
