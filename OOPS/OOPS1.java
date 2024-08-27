package OOPS;
public class OOPS1 {
    public static void main(String args[]){
        Pen p1 = new Pen();

        p1.setColor("Blue");
        System.out.println(p1.color);

        p1.setTip(99);
        System.out.println(p1.tip);

        p1.color = "LightBlue"; // this can be used instead of p1.setTip()
        // because of public access specifier
        System.out.println(p1.color);
    } 
}

class Pen {
    String color;
    int tip;

    void setColor(String newColor){
        color = newColor;
    }

    void setTip(int newTip){
        tip = newTip;
    }
}
