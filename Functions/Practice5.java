package Functions;
public class Practice5 {

    public static int fact(int num){
        int n = 1;
        for(int i=2; i<=num; i++){
            n *= i;
        }
        return n;
    }
    public static void main(String args[]){
        int num=5;

        int fact = fact(num);

        System.out.println(fact);


    }
    
}
