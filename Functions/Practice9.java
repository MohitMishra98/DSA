package Functions;
public class Practice9 {

    public static boolean isPrime(int n){
        if(n==2){
            return true;
        }

        for(int i=2; i*i<=n; i++){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }

    public static void primeRange(int n){
        for(int i=2; i<=n; i++){
            if(isPrime(i) == true){
                System.out.println(i);
            }
        }
    }
    public static void main(String args[]){
        primeRange(10000);
    }
    
}
