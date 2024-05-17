package BackTracking;

public class RAT_IN_A_DEAD_MAZE {
    public static void main(String[] args) {
        // move the rat in 4 ways and 0 will stop the rat
        int row=4;
        int col=6;
        boolean[][]isVisited=new boolean[row][col];
        int maze[][]={{1,0,1,1,1,1},
                      {1,1,1,1,0,1},
                      {0,1,1,1,1,1},
                      {0,0,1,0,1,1}};
        path(0,0,row-1,col-1,"",isVisited,maze);
    }
    private static void path(int sr, int sc, int er, int ec,String s,boolean[][]isVisited,int[][] maze) {
        if(sr<0 || sc<0) return;
        if(sr>er || sc>ec) return;
        if(isVisited[sr][sc]==true) return;
        if(sr==er && sc==ec){
            System.out.println(s);
            return;
        }
        if(maze[sr][sc]==0) return;
        isVisited[sr][sc]=true;
        // down
        path(sr+1,sc,er,ec,s+"D",isVisited,maze);
        // right
        path(sr,sc+1,er,ec,s+"R",isVisited,maze);
        // left
        path(sr,sc-1,er,ec,s+"L",isVisited,maze);
        // up
        path(sr-1,sc,er,ec,s+"U",isVisited,maze);

        isVisited[sr][sc]=false;
    }
}
