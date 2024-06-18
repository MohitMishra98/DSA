public class Practice3 {

    public static void spiral(int matrix[][]){
        int m = matrix[0].length;
        int n = matrix.length;


        int startRow = 0;
        int endRow = n-1;
        int startCol = 0;
        int endCol = n-1;

        while(startRow <= endRow && startCol <= endCol){
            // Top 
            for(int j=startCol; j<=endCol; j++){
                System.out.println(matrix[startRow][j] + " ");
            }

            // Right
            for(int i=startRow-1; i<=endRow; i++){
                System.out.println(matrix[i][endCol] + " ");
            }

            // bottom
            for(int j=endCol-1; j>=startCol; j--){
                System.out.println(matrix[endRow][j] + " ");
            }

            // 
            for(int i=endRow-1; i>=startRow+1; i--){
                System.out.println(matrix[i][startCol] + " ");
            }

            startRow++;
            endRow--;
            startCol++;
            endCol--;
        }
    }
    public static void main(String args[]){
        int matrix[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};

        spiral(matrix);
    }
    
}
