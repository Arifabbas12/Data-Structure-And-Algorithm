package Recursion;

public class totalPath {
    public static int countPaths(int i,int j,int n,int m){
         if(i==n || j==m){      // base case     = here we are leaving  from cell
             return 0;
         }

          if(i==n-1 && j==m-1){       // base case    =no move , because it is last path
              return 1;
          }

        // move Downwards                                   [make a matrix 3x3] then solve this question.
        int downPaths=countPaths(i+1,j,n,m);
        // move right
        int rightPaths=countPaths(i,j+1,n,m);
        return downPaths+rightPaths;
    }
    public static void main(String args[]){
        int n=3,m=3;
        System.out.println(countPaths(0,0,n,m));

    }
}
