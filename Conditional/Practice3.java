package Conditional;
import java.util.*;

public class Practice3 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int i = sc.nextInt();
        int tax;

        if(i<500000){
            tax = 0;
        }
        else if(i>=500000 && i<1000000){
            tax = (i*20)/100;
        }
        else{
            tax = (i*30)/100;
        }

        System.out.println(tax);

        sc.close();
    }
    
}
