package Loops;
import java.util.*;

public class Practice7 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        int len = sc.nextInt();

        for(int i=1; i<=len ; i++){
            System.out.println(i*num);
        }

        sc.close();

    }
    
}
