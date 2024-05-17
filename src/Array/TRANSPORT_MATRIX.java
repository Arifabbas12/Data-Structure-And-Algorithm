package Array;

public class TRANSPORT_MATRIX {
    public static int[][] transport(int matrix[][]){  // using extra space
        int r=matrix.length;
        int c=matrix[0].length;
        int ans[][]=new int[c][r];
        for(int i=0;i<c;i++){
            for(int j=0;j<r;j++){
                ans[i][j]=matrix[j][i];
            }
        }
        return ans;
    }
    public static void print(int matrix[][]){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int matrix[][]={{1,2,3,4},
                        {5,6,7,8},
                        {4,6,8,3}};
        print(transport(matrix));
        }
}
