package OOPS;
public class OOPS16 {
    public static void main(String args[]){
        Student s1 = new Student();
        s1.schoolName = "AAAAAAAA";
        System.out.println(s1.schoolName);

        Student s2 = new Student();
        System.out.println(s2.schoolName);

        Student s3 = new Student();
        s3.schoolName = "AAAAAAAAAAAAAAAAA";
    }   
}

class Student {
    String name;
    int roll;

    static String schoolName;

    void setName(String name){
        this.name = name;
    }

    String gatName(){
        return this.name;
    }
}