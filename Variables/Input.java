package Variables;
import java.util.*;

public class Input {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        // Scanner is a class in java.util
        // and we are making an object from that class "sc"
        // name of "sc" object can be anything then just use that name in .next

        String  input = sc.next();
        // next function only captures string input till " " (space caharacter)
        // and ignores all characters after that
        // Tony Stark will only print Tony

        System.out.println(input);

        String name = sc.nextLine();
        // nextLine takes whole string input including spaces
        // Tony Stark will print Tony Stark

        System.out.println(name);

        int number = sc.nextInt();
        // nextInt is used to take int input

        System.out.println(number);

        float price = sc.nextFloat();
        // nextFloat is used to take float input

        System.out.println(price);

        // Some other functions
        // nextByte
        // nextDouble
        // nextBoolean
        // nextShort
        // nextLong

    }
    
}
