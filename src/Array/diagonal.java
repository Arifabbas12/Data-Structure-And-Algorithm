package Array;
public class diagonal {
    public static int diagonalSum(int matrix[][]) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (i == j) {                  //primary Array.diagonal
                    sum += matrix[i][j];
                } else if (i + j == matrix.length - 1) {
                    sum += matrix[i][j];     //secondary Array.diagonal
                }
            }

        }                       //0(n2) is time complexsity
        return sum;
    }
        //for(int i=0;i<matrix.length;i++){
            //primary Array.diagonal
           // sum+=matrix[i][i];
            //secondary Array.diagonal
           // if(i!=matrix[0].length-i-1)
           // sum+=matrix[i][matrix.length-i-1];               // here i+j=n-1. so,j=n-1-i
       // }
       // return Array.sum;

    public static void main(String args[]){
        int matrix[][]={{1,2,3,4},
                        {5,6,7,8},             // Time complexity  O(n2)
                        {9,10,11,12},
                        {13,14,15,16}};
        System.out.println(diagonalSum(matrix));
    }
}
