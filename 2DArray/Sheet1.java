public class Sheet1 {

    public static void search(int matrix[][]){
        int m = matrix[0].length;
        int n = matrix.length;
        int ns = 0;

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(matrix[i][j] == 7){
                    ns++;
                }
            }
        }

        System.out.println("number of 7 found " + ns);
    }
    public static void main(String args[]){
        int matrix[][] = {{4,7,8},{8,8,7}};

        search(matrix);
    }
    
}
