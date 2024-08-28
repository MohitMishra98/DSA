package OOPS;
public class OOPS14 {
    public static void main(String args[]){
        Horse h = new Horse();

        h.walk();
    }
}

interface Animal {
    void walk();
}

class Horse implements Animal {
    public void walk(){
        System.out.println("has 4 legs");
    }
    // used public keyword because all fn inside interface are public
    // and defn of both should be same
}

class chicken implements Animal {
    public void walk(){
        System.out.println("has 2 legs");
    }
}

class Bird implements Animal {
    public void walk(){
        System.out.println("walks and fly");
    }
}