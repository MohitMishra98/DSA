package Variables;
public class TypePromotion {
    public static void main(String args[]){
        // Type promotions in Expressions

        // Java automatically promotes each byte, short, or char to int datatype
        // when evaluating an expression

        char a = 'a';
        char b = 'b';
        byte c = 99;

        System.out.println((int)a); // this is not type promotion this is type casting
        System.out.println((int)b); // only to show int values of a and b

        System.out.println(b-a);
        // this is type promotion

        int num = a + b + c;
        System.out.println(num);

        // If one operand is long, float, or double the whole expression is promoted
        // to long, float, or double respectively

        // this happens only when expression conatins + - * /
    }
    
}
