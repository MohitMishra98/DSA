package Functions;
public class practice2 {
    public static int revNum(int num){
        int lastDigit;
        int revNum = 0;
        
        while(num>0){

            lastDigit = num%10;
            revNum = revNum*10 + lastDigit;
            num /= 10;

        }
        return revNum;
    }

    public static boolean isPalindrome(int num){
        int revNum = revNum(num);

        if(revNum == num){
            return true;
        } else {
            return false;
        }
    }
    public static void main(String args[]){
        System.out.println(isPalindrome(99999999));
    }
    
}
