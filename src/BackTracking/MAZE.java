package BackTracking;

public class MAZE {
    public static void main(String[] args) {
        int row=3;
        int col=3;
        int count=maze(1,1,row,col);
        System.out.println(count);
    }
    private static int maze(int sr, int sc, int er, int ec) {
        if(sr>er && sc>ec) return 0;
        if(sr==er || sc==ec) return 1;
        int downWard=maze(sr+1,sc,er,ec);
        int rightWard=maze(sr,sc+1,er,ec);
        int totalWard=downWard+rightWard;
        return totalWard;
    }
}
