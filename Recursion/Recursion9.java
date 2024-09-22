
public class Recursion9 {
    public static int pow(int a, int n){
        if(n == 1){
            return a;
        }
        return a*pow(a, n-1);
    }
    public static void main(String args[]){
        System.out.println(pow(2,5));
    }
    
}
