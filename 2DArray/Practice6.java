public class Practice6 {

    public static boolean searchSort(int matrix[][],int key){
        int i = matrix.length-1;
        int j = 0;

        while(i >= 0 && j <= matrix.length-1){ // i is dec and should not be less than 0 
            if(key == matrix[i][j]){ // j is increasing and should not be greater than len
                return true;
            }
            
            if(key >= matrix[i][j]){ // check if key is greater than current cell
                j++; // move to right
            } else {
                i--; // move to top
            }
        }

        return false;
    }
    public static void main(String args[]){
        int matrix[][] = {{10,20,30,40},{15,25,35,45},{27,29,37,48},{32,33,39,50}};

        System.out.println(searchSort(matrix, 100));
    }
    
}
