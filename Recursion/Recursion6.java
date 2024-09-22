
public class Recursion6 {
    public static boolean isSorted(int i, int arr[]){
        if(arr.length-1 == i){
            return true;
        }
        return (arr[i] < arr[i+1] && isSorted(i+1, arr));

    }
    public static void main(String args[]){
        int arr[] = {1,2,3,4,9,6,7,8,9};

        System.out.println(isSorted(0, arr));
    }
    
}
