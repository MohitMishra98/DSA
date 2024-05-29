package Functions;
public class BScope {
    public static void main(String args[]){
        int p = 99;
        {
            int a = 99;
            System.out.println(a); // no error
            System.out.println(p); // no error
        }

        System.out.println(p); // no error
        //System.out.println(a);
        // this will give an error because a is in the scope of that code
        // and cannot be accessed outside that code AA
    }
    
}
