package Arrays;
public class Practice2 {

    public static int maxSubarraySum(int numbers[]){
        int max = Integer.MIN_VALUE;


        for(int i=0; i<numbers.length; i++){ // start
            for(int j=i; j<numbers.length; j++){ // end
                int sum = 0;
                for(int k=i; k<=j; k++){ // this loop is responsible for sub arrays
                    sum += numbers[k];
                }
                if(sum > max){
                    max = sum;
                }
            }
        }

        return max;
    }
    public static void main(String args[]){
        // this brute force method has O(n3) complexity due to 3 nested loop
        int numbers[] = {2,4,6,8,10};

        System.out.println(maxSubarraySum(numbers));
    }
    
}
