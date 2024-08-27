package OOPS;
public class OOPS7 {
    public static void main(String args[]){
        Fish shark = new Fish();

        shark.eat();
        shark.swim();
    }
}

class Animal {
    String color;

    void eat(){
        System.out.println("eats");
    }
}

class Fish extends Animal {
    int fins;

    void swim(){
        System.out.println("swims in water");
    }
}
