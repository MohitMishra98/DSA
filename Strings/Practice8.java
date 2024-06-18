public class Practice8 {

    public static String toUpperCase(String string){
        StringBuilder str = new StringBuilder("");

        str.append(Character.toUpperCase(string.charAt(0)));

        for(int i=1; i<string.length(); i++){
            if(string.charAt(i) == ' ' && i<string.length()-1){
                str.append(' ');
                i++;
                str.append(Character.toUpperCase(string.charAt(i)));
            } else {
                str.append(string.charAt(i));
            }
        }

        return str.toString();
        
    }
    public static void main(String args[]){
        String str = new String("this is a random string      ");

        System.out.println(toUpperCase(str));
    }
    
}
