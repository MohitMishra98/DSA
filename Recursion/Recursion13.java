
public class Recursion13 {
    public static int pairs(int n){
        if(n == 1){
            return 1;
        }
        if(n == 2){
            return 2;
        }

        return pairs(n-1) + (n-1)*pairs(n-2);
    }
    public static void main(String args[]){
        System.out.println(pairs(5));
    }
    
}
