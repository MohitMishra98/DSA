public class Practice5 {

    public static String subString(String str,int si,int ei){
        String subStr = "";

        for(int i=si; i<ei; i++){
            subStr += str.charAt(i);
        }

        return subStr;
    }
    public static void main(String args[]){
        String str = "Random String";

        // Note that si is included but ei is not included
        System.out.println(subString(str, 1, 9));

        // alternate
        System.out.println(str.substring(1,9));
    }
    
}
