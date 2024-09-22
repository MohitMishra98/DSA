
public class Recursion14 {
    public static int binaryString(int n, int lastPalce, String str){
        if(n == 0){
            System.out.println(str);
            return 1;
        }

        //System.out.print("0");
        binaryString(n-1,0,str+"0");

        if(lastPalce == 0){
            //System.out.print("1");
            binaryString(n-1, 1,str+"1");
        }

        return 1;
    }
    public static void main(String args[]){
        System.out.println(binaryString(3, 0,""));
    }
    
}
