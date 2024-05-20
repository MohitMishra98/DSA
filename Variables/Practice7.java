package Variables;
import java.util.*;

public class Practice7 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        float num1 = sc.nextFloat();
        float num2 = sc.nextFloat();
        float num3 = sc.nextFloat();

        float sum = num1 + num2 + num3;

        System.out.println(sum);

        sum = sum + (sum*18)/100;

        System.out.println(sum);


        sc.close();
    }
    
}
