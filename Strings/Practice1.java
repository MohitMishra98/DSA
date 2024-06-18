import java.util.*;

public class Practice1 {
    public static void main(String args[]){
        char arr[] = {'a','b','c','d'};

        // declsaring a string
        String str = "abcd";

        String str2 = new String("xy");

        // Strings are immutable in java

        Scanner sc = new Scanner(System.in);

        String str3;

        str3 = sc.nextLine();

        System.out.println(str3);

        // length function
        System.out.println(str3.length());

        // concat
        String str80 = "random";
        String str81 = "String";

        String str82 = str80 + " " + str81;
        System.out.println(str82);

        // charAt function
        System.out.println(str82.charAt(0));
    }
    
}
