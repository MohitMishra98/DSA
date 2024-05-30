package Functions;
public class Binary {

    public static int decToBinary(int decNum){
        int binNum = 0;
        int pow = 0;
        int mod = 0;

        while(decNum > 0){
            mod = decNum%2;
            binNum = binNum + mod*(int)Math.pow(10,pow);
            pow++;
            decNum /= 2;
        }

        return binNum;
    }
    public static void main(String args[]){
        System.out.println(decToBinary(1000));
    }
    
}
