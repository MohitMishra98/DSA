
public class Recursion10 {
    public static int pow(int a, int n){
        if(n == 1){
            return a;
        }

        if(n%2 == 0){
            int val = pow(a,n/2);
            return val*val;
        } else {
            int val = pow(a,n/2);
            return a*val*val;
        }
    }
    public static void main(String args[]){
        System.out.println(pow(2,5));
    }
    
}
