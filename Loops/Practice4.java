package Loops;
import java.util.*;

public class Practice4 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        while(true){
            int n = sc.nextInt();

            if(n%10 == 0){
                continue;
            }

            System.out.println(n);
        }
    }
    
}
