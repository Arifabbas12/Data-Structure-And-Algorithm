package Array;

public class ROTATE_THE_MATRIX90DEGREE {
    public static void reverse(int matrix[]){
        int first=0;
        int last=matrix.length-1;
        while(first < last){
            int temp=matrix[last];
            matrix[last]=matrix[first];
            matrix[first]=temp;
            first++;
            last--;
        }
    }
    public static void transpose(int matrix[][]){
        int r=matrix.length;
        int c=matrix[0].length;
        for(int i=0;i<r;i++){
            for(int j=i;j<c;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
    }
    public static void rotate(int matrix[][]){
        transpose(matrix);
        for(int i=0;i<matrix.length;i++){
            reverse(matrix[i]);
        }
    }
    // print
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
                        {4,6,8,3},
                        {3,5,7,5}};
        rotate(matrix);
        print(matrix);
    }
}
