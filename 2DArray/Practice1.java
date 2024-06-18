import java.util.*;

public class Practice1 {
    public static void main(String args[]){
        int matrix[][] = new int[3][3];
        // Making a 2D array
        
        int m = matrix[0].length; // No of row
        int n = matrix.length;    // No of col
        
        Scanner sc = new Scanner(System.in);

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    
}
