package OOPS;
public class OOPS11 {
    public static void main(String args[]){
        Horse h = new Horse();
        h.eat();
        h.walk();

        Chicken c = new Chicken();
        c.eat();
        c.walk();

        // Animal a = new Animal(); this will not work because it is an abstract class
    }    
}

abstract class Animal {
    void eat(){
        System.out.println("Eats Grass");
    }

    abstract void walk();
}

class Horse extends Animal {
    void walk(){
        System.out.println("walks on 4 legs");
    }
}

class Chicken extends Animal {
    void walk(){
        System.out.println("walks on 2 legs");
    }
}