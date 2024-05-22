package Conditional;
public class Ternary {
    public static void main(String args[]){
        // var = condition ? stat1 : stat2;
        // if condition is true then ?
        // if condition is false then :
        int num = 5;

        String type = (num%2 == 0) ? "even" : "Odd";

        System.out.println(type);
    }
    
}
