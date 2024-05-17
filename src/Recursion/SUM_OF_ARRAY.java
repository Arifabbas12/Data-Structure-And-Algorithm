package Recursion;

public class SUM_OF_ARRAY {
    public static int sumOfNum(int arr[],int idx){
        if(idx==arr.length-1) return arr[idx];
        int smallAns=sumOfNum(arr,idx+1);
        return smallAns+arr[idx];
    }
    public static void main(String[] args) {
        int arr[]={1,3,4,5,6};
        System.out.println(sumOfNum(arr,0));
    }
}
