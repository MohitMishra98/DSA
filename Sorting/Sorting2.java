package Sorting;
public class Sorting2 {

    public static void selectionSort(int arr[]){
        // find the position of min valued element and swap with current first element

        int n = arr.length;
        for(int i=0; i<n-1; i++){
            // to find index of array after index of current iteraton
            int minP = i;
            int min = Integer.MAX_VALUE;

            for(int j=i; j<n; j++){
                if(min > arr[j]){
                    min = arr[j];
                    minP=j;
                }
            }

            // swap
            int temp = arr[i];
            arr[i] = arr[minP];
            arr[minP] = temp;
        }
    }
    public static void main(String args[]){
        int arr[] = {5,4,1,3,2};

        selectionSort(arr);

        for(int i=0;i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
    
}
