package Conditional;
public class Switch {
    public static void main(String args[]){
        int num = 5;

        switch(num){
            case 1 : System.out.println("samosa");break;
            case 2 : System.out.println("burger");break;
            case 3 : System.out.println("mango shake");break;
            default : System.out.println("no case");
        }

        // use break 
        // else it will print all things below that
        // even the default case
    }
    
}
