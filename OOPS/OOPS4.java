package OOPS;
public class OOPS4 {
    public static void main(String args[]){
        Student s1 = new Student("Random");
        Student s2 = new Student(99);

        System.out.println(s1.name);
        System.out.println(s2.roll);
    }
}

class Student {
    String name;
    int roll;

    Student(String name){
        System.out.println("constructor is called.......");
        this.name = name;
    }

    // constructors can also be overloaded

    Student(int roll){
        System.out.println("constructor is called...........");
        this.roll = roll;
    }
}
