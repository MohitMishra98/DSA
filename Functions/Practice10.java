package Functions;
public class Practice10 {

    public static int binaryToDecimal(int binNum){
        int pow = 0;
        int decNum = 0;
        int lastDigit = 0;
        
        while(binNum!=0){
            lastDigit = binNum%10;
            decNum = decNum + (lastDigit*(int)Math.pow(2,pow));
            pow++;
            binNum /= 10;
        }

        return decNum;
    }
    public static void main(String args[]){
        System.out.println(binaryToDecimal(111111111));
    }
    
}
