public class Arrays9 {

    public static void pairs(int numbers[]){
        for(int i=0; i<numbers.length; i++){
            for(int j=i+1; j<numbers.length; j++){
                System.out.println(numbers[i] + "," + numbers[j]);
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        int numbers[] = {95,96,97,98,99};

        pairs(numbers);
    }
    
}
