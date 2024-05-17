package BackTracking;

public class printPath {
    public static void main(String[] args) {
        // move the rat in 4 ways
        int row=3;
        int col=3;
        boolean[][]isVisited=new boolean[row][col];
        path(0,0,row-1,col-1,"",isVisited);
    }
    private static void path(int sr, int sc, int er, int ec,String s,boolean[][]isVisited) {
        if(sr<0 || sc<0) return;
        if(sr>er || sc>ec) return;
        if(isVisited[sr][sc]==true) return;
        if(sr==er && sc==ec){
            System.out.println(s);
            return;
        }
        isVisited[sr][sc]=true;
        // down
        path(sr+1,sc,er,ec,s+"D",isVisited);
        // right
        path(sr,sc+1,er,ec,s+"R",isVisited);
        // left
        path(sr,sc-1,er,ec,s+"L",isVisited);
        // up
        path(sr-1,sc,er,ec,s+"U",isVisited);

        isVisited[sr][sc]=false;
    }
}
