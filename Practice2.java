import java.util.*;

public class Practice2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        while(n>0){
            System.out.println(n%10); // to get last digit modulo by 10
            n /= 10; // to remove last digit div n by 10
        }

        sc.close();
    }
    
}
