public class Practice2 {

    public static boolean isPalindrome(String str){
        int len = str.length()-1;
        int i = 0;

        while(len > i){
            if(str.charAt(i) != str.charAt(len)){
                return false;
            }
            i++;
            len--;
        }

        return true;
    }
    public static void main(String args[]){
        String str = "racecar";

        System.out.println(isPalindrome(str));
    }
    
}
