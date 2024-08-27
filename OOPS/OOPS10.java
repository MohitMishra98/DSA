package OOPS;
public class OOPS10 {
    public static void main(String args[]){
        Deer p1 = new Deer();

        p1.eats();
    }
}

class Animal {
    void eats(){
        System.out.println("eats anything");
    }
}

class Deer extends Animal {
    void eats(){
        System.out.println("eats grass");
    }
}