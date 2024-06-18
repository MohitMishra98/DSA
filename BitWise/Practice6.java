public class Practice6 {

    public static int clearRangeOfBits(int n, int i, int j){
        int a = ( (-1)<<(j+1) );
        int b = ( (1<<i) -1 ); // OR 

        int bitMask = a | b;

        return n & bitMask;
    }
    public static void main(String args[]){
        System.out.println(clearRangeOfBits(10, 2, 4));
    }
    
}
