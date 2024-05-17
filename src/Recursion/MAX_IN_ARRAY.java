package Recursion;

public class MAX_IN_ARRAY {
    public static int maxArray(int arr[],int idx){
        if(idx==arr.length-1){
            return arr[idx];
        }
        int ma=maxArray(arr,idx+1);
        return Math.max(arr[idx],ma);
    }
    public static void main(String[] args) {
        int arr[]={11,23,54,99,87};
        System.out.println(maxArray(arr,0));
    }
}
