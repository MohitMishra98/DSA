package Arrays;
public class Arrays5 {

    public static int maxValue(int numbers[]){
        int max = Integer.MIN_VALUE;

        for(int i=0; i<numbers.length; i++){
            if(max < numbers[i]){
                max = numbers[i];
            }
        }

        return max;
    }
    public static void main(String args[]){

        // max value of an array

        int numbers[] = {90,92,95,95,85,99};

        int max = maxValue(numbers);

        System.out.println("Max value " + max);
    }
    
}
