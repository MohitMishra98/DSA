package Loops;
import java.util.*;

public class Practice6 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int fact = 1;

        int n = sc.nextInt();

        // we can also add fact 0 = 1

        for(int i = 1; i<=n; i++){
            fact *= i;
        }

        System.out.println(fact);

        sc.close();

    }
    
}
