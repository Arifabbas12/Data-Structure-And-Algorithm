package Recursion;

public class shortinre {
    public static boolean isShort(int arr[],int i){
        if(i==arr.length-1){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
        return isShort(arr,i+1);
    }
    public static void main(String args[]){
        int arr[]={1,2,3,4,5};
        System.out.println(isShort(arr,0));
    }
}
