package Functions;
public class MethodScope {
    public static void num(){
        int s = 99;
        System.out.println(s);
    }
    public static void main(String args[]){
        // System.out.println(s);
        // this will give an error as s is inside another function
    }
    
}
