package Arrays;
public class Practice1 {

    public static void subArray(int numbers[]){

        for(int i=0; i<numbers.length; i++){ // counts the start
            for(int j=i; j<numbers.length; j++){ // counts the end
                for(int k=i; k<=j; k++){
                    System.out.print(numbers[k] + " "); // prints the array from start to end
                }
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        int numbers[] = {2,4,6,8,10};

        subArray(numbers);
    }
    
}
