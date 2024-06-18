public class Sheet1 {

    public static int vowelCount(String s){
        int num = 0;
        
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                num++;
            }
        }

        return num;
    }
    public static void main(String args[]){
        String str = "this is a random string";

        System.out.println(vowelCount(str));
    }
    
}
