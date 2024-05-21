package Operators;
public class AOperator1 {
    public static void main(String args[]){
        // preincrement 

        int a = 10;
        int b = ++a; // this will also change the value of a
        // this will change the value of a to 11
        // and then assign it to b

        System.out.println(a);
        System.out.println(b);
        // both a and b will be 11


        // postincrement

        a = 10;
        b = a++; // this will change the value of a
        // a(10) will be assigned to b
        // and then a will be incremented to 11

        System.out.println(a); // 11
        System.out.println(b); // 10
    }
    
}
