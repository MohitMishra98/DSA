package OOPS;
public class OOPS2 {
    public static void main(String args[]){
        BankAccount acc1 = new BankAccount();

        acc1.userName = "Random";
        System.out.println(acc1.userName);

        // acc1.password = "Hmmmmmm"; this will not work as password is a private data

        acc1.setPassword("thisisasupersecurepassword99999999");
        acc1.displayPassword();
    }
}

class BankAccount {
    public String userName;
    private String password; // this cannot be accessed outside of this class 
    // only methods inside this class can access this data

    void setPassword(String pwd){
        password = pwd;
    }

    void displayPassword(){
        System.out.println(password);
    }
}
