package Arrays;
public class Arrays3 {

    public static void update(int marks[]){
        for(int i=0; i<marks.length; i++){
            marks[i] = marks[i] + 1;
        }
    }
    public static void main(String args[]){

        // arrays are always passed by reference in function
        // any updation in other function will reflect in original array

        int marks[] = {97,98,99};

        update(marks);

        for(int i=0; i<marks.length; i++){
            System.out.println(marks[i]);
        }
    }
    
}
