package Array;

public class DELETE_AN_ELEMENT_IN_ARRAY {
    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 50};
        int dl = 30;

        for(int i=0;i<arr.length;i++){
            if(dl==arr[i]){
                for(int j=i;j<arr.length-1;j++){
                    arr[j]=arr[j+1];
                }
                break;
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
