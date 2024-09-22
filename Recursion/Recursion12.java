
public class Recursion12 {
    public static StringBuilder duplicates(int map[],String str,int n,StringBuilder newstr){
        if(n == str.length()){
            return newstr;
        }
        if(map[str.charAt(n)-'a'] != 1){
            newstr.append(str.charAt(n));
            map[str.charAt(n)-'a'] = 1;
        }

        return duplicates(map, str, n+1, newstr);

    }
    public static void main(String args[]){
        int map[] = new int[26];
        StringBuilder ns = new StringBuilder("");

        System.out.println(duplicates(map, "aaassasaegfhagdgfsdadfds", 0, ns));
    }
    
}
