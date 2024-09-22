
public class Recursion7 {
    public static int occurence(int i, int key, int arr[]){
        if(arr[i] == key){
            return i;
        }
        if(i == arr.length-1){
            return -1;
        }
        return occurence(i+1, key, arr);
    }
    public static void main(String args[]){
        int arr[] = {8,3,6,9,5,10,2,5,3};
        System.out.println(occurence(0, 1, arr));
    }
    
}
