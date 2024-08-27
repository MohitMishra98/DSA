package OOPS;
public class OOPS9 {
    public static void main(String args[]){
        Calculator calc = new Calculator();

        System.out.println(calc.sum(97,98));
        System.out.println(calc.sum(98.5f,99.5f));
        System.out.println(calc.sum(97,98,99));
    }
}

class Calculator {
    int sum(int a, int b){
        return a + b;
    }

    float sum(float a, float b){
        return a + b;
    }

    int sum(int a, int b, int c){
        return a + b + c;
    }
}