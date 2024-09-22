
public class Recursion2 {
    public static void printNums(int n){
        if(n == 1){
            System.out.println(n);
            return;
        }

        printNums(n-1);
        System.out.println(n);
    }
    public static void main(String args[]){
        printNums(10);
    }
    
}
