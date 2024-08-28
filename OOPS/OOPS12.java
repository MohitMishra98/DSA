package OOPS;
public class OOPS12 {
    public static void main(String args[]){
        Horse h = new Horse();
        h.eat();
        h.walk();
        System.out.println(h.color);

        Chicken c = new Chicken();
        c.eat();
        c.walk();
        System.out.println(c.color);

        // Animal a = new Animal(); this will not work because it is an abstract class
    }
}

abstract class Animal {
    String color;

    Animal(){ // constructor of base class is called when creating object of derived class
        color = "Blue";
    }

    void eat(){
        System.out.println("Eats Grass");
    }

    abstract void walk();

    void changeColor(String color){
        this.color = color;
    }
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