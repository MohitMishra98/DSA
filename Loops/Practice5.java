package Loops;
import java.util.*;

public class Practice5 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int i = 10;

        int evenSum = 0;
        int oddSum = 0;

        for(i=0; i<10; i++){
            int n = sc.nextInt();

            if(n%2 == 0){
                evenSum += n;
            }
            else{
                oddSum += n;
            }
        }

        System.out.println("Sum of even numbers entered is : " + evenSum);
        System.out.println("Sum of Odd numbers Entered is : " + oddSum);

        sc.close();

    }
    
}
