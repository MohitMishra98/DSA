package Sorting;
public class Sorting5 {
    public static void countSort(int arr[]){
        int n = arr.length;

        // finding largest number of array
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            if(largest < arr[i]){
                largest = arr[i];
            }
        }

        // counting number of occurences of each number in array
        int count[] = new int[largest+1];

        for(int i=0; i<n; i++){
            int temp = arr[i];
            count[temp]++;
        }

        // placing elements in original array
        int sc = 0;

        for(int i=0; i<count.length; i++){
            while(count[i] != 0){
                arr[sc] = i;
                count[i]--;
                sc++;
            }

        }
    }
    public static void main(String args[]){
        int arr[] = {5,4,1,3,2};

        countSort(arr);

        for(int i=0;i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
    
}
