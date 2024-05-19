package Variables;
public class TypePromotion1 {
    public static void main(String args[]){
        int a = 10;
        float b = 20.25f;
        long c = 25;
        double d = 30;
        double ans = a + b + c + d;
        // all data converted into double
        System.out.println(ans);

        // byte num = 5;
        // b = b * 2;
        // this will give error because byte will be converted into int
        // and int cannot be stored into byte

        byte n = 5;
        n = (byte)(n*2);
        // this is correct
    }
    
}
