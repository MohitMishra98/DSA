
public class Recursion1 {
    public static void printNums(int n){
        if(n == 1){
            System.out.println(n);
        } else { 
        System.out.println(n);
        printNums(n-1);
        }
    }
    public static void main(String args[]){
        printNums(10);
    }
    
}
