package OOPS;
public class OOPS5 {
    public static void main(String args[]){
        Pen p1 = new Pen();

        p1.color = "Blue";
        p1.tip = 99;

        p1.tiparr[0] = 91;
        p1.tiparr[1] = 92;
        p1.tiparr[2] = 93;
        p1.tiparr[3] = 94;
        p1.tiparr[4] = 95;

        p1.display();
        
        Pen p2 = new Pen(p1);

        p2.display();

        p1.tiparr[4] = 99;

        p1.display();
        p2.display();
    }
}

class Pen {
    String color;
    int tip;
    int tiparr[] = new int[5];

    Pen(){}

    // copy constructor shallow copy
    Pen(Pen p1){
        this.color = p1.color;
        this.tip = p1.tip;
        this.tiparr = p1.tiparr; // this will create shallow copy of array
        // any changes in original array will reflect in copy array too
    }

    void display(){
        System.out.println(this.color);
        System.out.println(this.tip);

        for(int i=0; i<5; i++){
            System.out.println(this.tiparr[i]);
        }
    }
}