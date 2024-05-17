package String;

public class shortestpath {
    public static float getShortestPath(String path){
        int x=0;
        int y=0;
        for(int i=0;i<path.length();i++){
            char dir=path.charAt(i);
            // SOUTH
            if(dir=='S'){
                y--;
            }
            // NORTH
           else if(dir=='N'){
                y++;
            }
            // WEST
           else if(dir=='W'){
                x--;
            }
            // EAST
            else{
                x++;
            }
        }
        int x2=x*x;         // x2 means x square
        int y2=y*y;        // y2 means y square
        return (float)Math.sqrt(x2+y2);       // here use formula x2-x1 of hole square & y2-y1 of hole square
    }
    public static void main(String args[]){
        String path="WNEENESENNN";
        System.out.println(getShortestPath(path));
    }
}
