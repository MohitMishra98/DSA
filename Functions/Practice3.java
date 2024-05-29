package Functions;
import java.util.*;

public class Practice3 {

    public static int sum(int a,int b){ // a and b are parameters or formal parameters
        int c = a + b;
        return c;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum = sum(a,b); // a and b are arguments or actual parameters

        System.out.println(sum);

        sc.close();
    }
    
}