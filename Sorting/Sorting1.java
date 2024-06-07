package Sorting;
public class Sorting1 {

    public static void bubbleSort(int arr[]){
        for(int turn=0; turn<arr.length-1; turn++){ // -1 instaed of -2 because of <
            for(int j=0; j<arr.length-1-turn; j++){ // -1 instaed of -2 because of <
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void main(String args[]){
        int arr[] = {5,4,1,3,2};

        bubbleSort(arr);

        for(int i=0;i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
    
}
