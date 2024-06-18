public class Practice5 {

    public static boolean searchSort(int matrix[][],int key){
        int i = 0;
        int j = matrix.length-1;

        while(i < matrix.length && j >= 0){
            if(matrix[i][j] == key){
                return true;
            }

            if(key < matrix[i][j]){
                j--;
            } else {
                i++;
            }
        }

        return false;
    }
    public static void main(String args[]){
        int matrix[][] = {{10,20,30,40},{15,25,35,45},{27,29,37,48},{32,33,39,50}};

        System.out.println(searchSort(matrix, 100));
    }
    
}
