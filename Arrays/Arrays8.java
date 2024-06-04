package Arrays;
public class Arrays8 {

    public static void revArray(int numbers[]){
        int temp = 0;
        int first = 0;
        int last = numbers.length-1;

        while(first < last){
            temp = numbers[last];
            numbers[last] = numbers[first];
            numbers[first] = temp;

            first++;
            last--;
        }
    }
    public static void main(String args[]){
        int numbers[] = {95,96,97,98,99};

        // reverse an array

        revArray(numbers);

        for(int i=0; i<numbers.length; i++){
            System.out.println(numbers[i]);
        }
    }
    
}
