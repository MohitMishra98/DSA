package Conditional;
import java.util.*;

public class Practice7 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();

        if(y%400 == 0 || y%100 == 0 || !(y%4 == 0)){
            System.out.println("NLA");
        }
        else {
            System.out.println("LA");
        }
    

        sc.close();
    }
    
}
