public class Practice3 {

    public static void spiral(int arr[][]){
        int startRow = 0;
        int startCol = 0;
        int endRow = arr.length-1;
        int endCol = arr[0].length-1;

        System.out.println("Here is spiral Matrix : ");

        while(startRow <= endRow && startCol <= endCol){
            
            for(int i=startCol; i<= endCol; i++){
                System.out.println(arr[startRow][i]);
            }
            startRow++;

            for(int i=startRow; i<=endRow; i++){
                System.out.println(arr[i][endCol]);
            }
            endCol--;

            for(int i=endCol; i>=startCol; i--){
                System.out.println(arr[endRow][i]);
            }
            endRow--;

            for(int i=endRow; i>=startRow; i--){
                System.out.println(arr[i][startCol]);
            }
            startCol++;
        }
    }
    public static void main(String args[]){
        int matrix[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};

        spiral(matrix);
    }
    
}
