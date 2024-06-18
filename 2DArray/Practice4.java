public class Practice4 {

    public static int diagonalSum(int matrix[][]){
        int sum = 0;

        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<=matrix[0].length; j++){
                if(i==j || i+j == matrix.length-1){
                    sum += matrix[i][j];
                }
            }
        }

        if(matrix.length%2 != 0){
            sum = sum - matrix[matrix.length/2][matrix.length/2];
        }

        return sum;
    }

    public static int diagonalSumOpti(int matrix[][]){
        int sum = 0;

        // main diagonal has always i=j
        for(int i=0; i<matrix.length; i++){
            sum += matrix[i][i];
        }

        // sum of index is matrix.length-1
        for(int i=0,j=matrix.length-1; j>=0; i++,j--){
            sum += matrix[i][j];
        }

        // removing duplicate elements (middle one in odd matrix)
        // it will added 2 so we will just remove 1
        if(matrix.length%2 != 0){
            sum = sum - matrix[matrix.length/2][matrix.length/2];
        }

        return sum;
    }
    public static void main(String args[]){
        int matrix[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int matrix1[][] = {{1,2,3},{5,6,7},{9,10,11}};

        System.out.println(diagonalSum(matrix));
        System.out.println(diagonalSumOpti(matrix1));
    }
    
}
