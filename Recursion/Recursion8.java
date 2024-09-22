
public class Recursion8 {
    public static int occurence(int i, int key, int arr[]){
        if(i == arr.length){
            return -1;
        }
        int val = occurence(i+1, key, arr);
        if(val != -1){
            return val;
        }
        if(arr[i] == key){
            return i;
        }
        return -1;

    }
    public static void main(String args[]){
        int arr[] = {8,3,6,9,5,10,2,5,3};

        System.out.println(occurence(0, 5, arr));
    }
    
}
