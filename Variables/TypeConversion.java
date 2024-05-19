package Variables;
import java.util.*;

public class TypeConversion {
    public static void main(String args[]){
        // Type conversion

        // type conversion happens automatically in java when
        // type compatible
        // size of destination type > size of source type

        // byte > short > int > float > long > double

        // byte can be converted into double
        // but double can not be converted into byte

        int a = 25;
        long b = a; 
        // this will not give any error

        System.out.println(b);

        // long a = 25;
        // int b = a;
        //this will give a error

        System.out.println(b);

        Scanner sc = new Scanner(System.in);

        // int number = sc.nextFloat();
        // this will give an error

        float number = sc.nextInt();
        // this will not give any error

        System.out.println(number);


    }
    
}
