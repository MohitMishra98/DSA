package OOPS;
public class OOPS15 {
    public static void main(String args[]){
        AnimalBird a = new AnimalBird();

        a.walks();;
        a.walksfly();
    }    
}

interface Animal {
    void walks();
}

interface Bird {
    void walksfly();
}

class AnimalBird implements Animal, Bird {
    public void walks(){
        System.out.println("Can walk");
    }

    public void walksfly(){
        System.out.println("can walk and fly");
    }
}