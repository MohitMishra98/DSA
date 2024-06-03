public class Arrays6 {

    public static int binarySearch(int numbers[], int key){
        int start = 0;
        int end = numbers.length-1;

        while(start <= end){
            int mid = (start+end)/2;

            if(numbers[mid] == key){
                return mid;
            }

            if(numbers[mid] > key){ // right
                end = mid-1;
            } else { // left
                start = mid+1;
            }
        }

        return -1;
    }
    public static void main(String args[]){
        int numbers[] = {90,92,95,95,85,99};
        int key = 99;

        int index = binarySearch(numbers,key);

        System.out.println("Found at " + index);
    }
    
}
