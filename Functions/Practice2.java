package Functions;
import java.util.*;

public class Practice2 {

    public static void sum(int a,int b){ // these can be any name
        int c = a + b;
        System.out.println(c);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        sum(a,b);

        sc.close();
    }
    
}
