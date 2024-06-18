public class Sheet3 {

    public static void invertMatrix(int matrix[][]){
        int m = matrix[0].length;
        int n = matrix.length;

        int invMatrix[][] = new int[m][n];

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                invMatrix[i][j] = matrix[j][i];
            }
        }

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                matrix[i][j] = invMatrix[i][j];
            }
        }
    }

    public static void printMatrix(int matrix[][]){
        int m = matrix[0].length;
        int n = matrix.length;

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.print(matrix[i][j] + "  ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        int matrix[][] = {{1,4,9},{11,4,3},{2,2,3}};

        printMatrix(matrix);

        invertMatrix(matrix);

        printMatrix(matrix);
    }
    
}
