package Arrays;
public class Practice4 {

    public static int maxSubarraySum(int numbers[]){
        int currentSum = 0;
        int max = Integer.MIN_VALUE;
        for(int i=0; i<numbers.length; i++){
            currentSum += numbers[i];
            if(currentSum < 0){
                currentSum = 0;
            }

            if(max < currentSum){
                max = currentSum;
            }
        }

        return max;
    }
    public static void main(String args[]){
        int numbers[] = {-2,-3,4,-1,-2,1,5,-3};

        System.out.println(maxSubarraySum(numbers));
    }
    
}
