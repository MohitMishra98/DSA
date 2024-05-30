package Functions;
public class practice1 {

    public static int sumOfDigits(int num){
        int sum = 0;
        int lastDigit = 0;
        while(num>0){
            lastDigit = num%10;
            sum = sum + lastDigit;
            num /= 10;
        }
        return sum;
    }
    public static void main(String args[]){
        System.out.println(sumOfDigits(1234));
    }
    
}
