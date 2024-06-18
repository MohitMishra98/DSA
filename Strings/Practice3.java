public class Practice3 {

    public static float shortestPath(String str){
        int x = 0;
        int y = 0;

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);

            if(ch == 'N'){
                y++;
            } else if(ch == 'S'){
                y--;
            } else if(ch == 'E'){
                x++;
            } else {
                x--;
            }
        }

        float shortPath = (float)Math.sqrt(x*x + y*y);

        return shortPath;
    }
    public static void main(String args[]){
        String directions = "WNEENESENNN";

        System.out.println(shortestPath(directions));
    }
    
}
