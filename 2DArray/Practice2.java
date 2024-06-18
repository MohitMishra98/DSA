import java.util.*;

public class Practice2 {

    public static boolean search(int matrix[][], int key){
        int m = matrix[0].length;
        int n = matrix.length;

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(matrix[i][j] == key){
                    System.out.println("Key found at index " + i + j);
                    return true;
                }
            }
        }

        return false;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int matrix[][] = new int[3][3];

        int m = matrix[0].length;
        int n = matrix.length;

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        search(matrix,99);
    }
    
}
