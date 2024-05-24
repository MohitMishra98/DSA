public class Practice3 {
    public static void main(String args[]){
        int n = 7576677; // num

        int num = 0; //rev num

        int num1 = 0; // last digit
        
        while(n>0){
            num1 = n%10; // get last digit by modulo by 10
            num = num*10 + num1; // add last digit to rev
            n /= 10; // div by 10 to remove last digit
        }

        System.out.println(num);
    }
    
}
