package Arrays;
public class Practice3 {

    public static int prefixSum(int numbers[]){
        int prefixSum[] = new int[numbers.length];

        int max = Integer.MIN_VALUE;

        prefixSum[0] = numbers[0];

        for(int i=1; i<numbers.length; i++){
            prefixSum[i] = prefixSum[i-1] + numbers[i];
        }

        for(int i=0; i<numbers.length; i++){  // start
            for(int j=i; j<numbers.length; j++){  // end
                int sum = i == 0 ? prefixSum[j] : prefixSum[j] - prefixSum[i-1];

                if(sum > max){
                    max = sum;
                }
            }
        }

        return max;
    }
    public static void main(String args[]){
        // this optimized method has O(n2) complexity due to 2 nested loop
        int numbers[] = {1,-2,6,-1,3};

        System.out.println(prefixSum(numbers));
    }
    
}
