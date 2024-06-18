public class Sheet2 {

    public static void sumSecondRow(int matrix[][]){
        int m = matrix[0].length;
        int sum = 0;

        for(int i=0; i<m; i++){
            sum = sum + matrix[1][i];
        }

        System.out.println("Sum of elements of second row is " + sum);
    }
    public static void main(String args[]){
        int matrix[][] = {{1,4,9},{11,4,3},{2,2,3}};

        sumSecondRow(matrix);
    }
    
}
