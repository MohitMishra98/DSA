package Conditional;
import java.util.*;

public class Practice1 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if(a>b){
            System.out.println("Greater is : " + a);
        }
        else{
            System.out.println("Greater is : " + b);
        }

        sc.close();
    }
    
}
