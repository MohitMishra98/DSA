package OOPS;
public class OOPS13 {
    public static void main(String args[]){
        Chicken c = new Chicken();
        c.walk();
    }
}

abstract class Animal {
    Animal(){ // constructor of base class is called when creating object of derived class
        System.out.println("constructor of animal class");
    }

    void eat(){
        System.out.println("Eats Grass");
    }

    abstract void walk();
}

class Horse extends Animal {
    Horse(){
        System.out.println("constructor of horse class");
    }
    void walk(){
        System.out.println("walks on 4 legs");
    }
}

class Chicken extends Horse {
    Chicken(){
        System.out.println("constructor of chicken class");
    }
    void walk(){
        System.out.println("walks on 2 legs");
    }
}