package OOPS;
public class OOPS8 {
    public static void main(String args[]){
        Bird p1 = new Bird();
        Mammals p2 = new Mammals();
        Fish p3 = new Fish();

        p1.eat();
        p2.eat();
        p3.eat();
    }    
}

class Animal {
    String color;

    void eat(){
        System.out.println("eats");
    }
}

class Mammals extends Animal {
    int legs;
}

class Bird extends Animal {
    void fly(){
        System.out.println("fly");
    }
}

class Fish extends Animal {
    String breed;
}