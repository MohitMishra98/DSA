
public class Recursion5 {
    public static int fibonacci(int n){
        if(n == 1){
            return 0;
        } else if(n == 2){
            return 1;
        } else {
            int fibn = fibonacci(n-1) + fibonacci(n-2);
            return fibn;
        }
    }
    public static void main(String args[]){
        System.out.println(fibonacci(26));
    }
    
}
