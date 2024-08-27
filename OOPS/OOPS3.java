package OOPS;
public class OOPS3 {
    public static void main(String args[]){
        Pen p1 = new Pen();

        p1.setColor("Blue");
        System.out.println(p1.getColor());

        p1.setTip(99);
        System.out.println(p1.getTip());
    }
}

class Pen {
    private String color;
    private int tip;

    // getters
    String getColor(){
        return this.color;
    }

    int getTip(){
        return this.tip;
    }

    // setters
    void setColor(String color){
        this.color = color;
    }

    void setTip(int tip){
        this.tip = tip;
    }

    // this.tip represents data of objects and 
    // tip represents data outside of object
}