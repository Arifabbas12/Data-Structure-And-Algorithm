package Array;

public class Two_D_ARRAY {
    static void printArr(int arr[][]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void add(int a[][],int b[][]){
        int sum[][]=new int[4][3];
        for(int i=0;i<a.length-1;i++){
            for(int j=0;j<b.length-1;j++){
                 sum[i][j]=a[i][j]+b[i][j];
            }
        }
        printArr(sum);
    }
    public static void main(String[] args) {
        int a[][] ={{1,2,3},
                    {5,6,7},
                    {9,10,11},
                    {13,14,15}};
        int b[][] ={{1,2,7},
                    {5,6,7},
                    {9,10,11},
                    {13,14,15}};

        add(a,b);

    }
}