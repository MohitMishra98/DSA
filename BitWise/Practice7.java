public class Practice7 {

    public static boolean checkPowerOf2(int n){
        if((n & (n-1)) == 0){
            return true;
        } else {
            return false;
        }
    }
    public static void main(String args[]){
        System.out.println(checkPowerOf2(64));
    }
    
}
