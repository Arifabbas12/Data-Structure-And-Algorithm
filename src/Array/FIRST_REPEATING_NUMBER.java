package Array;

public class FIRST_REPEATING_NUMBER {
    public static int repeatNum(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]) return arr[i];
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={1,3,2,1,2,3,4};
        System.out.println(repeatNum(arr));

    }
}
