package Recursion;
public class linear {
    public static int linearSearch(int arr[],int key,int i){
        if(i==arr.length){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return linearSearch(arr,key,i+1);
    }
    public static void main(String[] args) {
        int arr[]={2,3,5,7,8};
        int key=5;
        System.out.println(linearSearch(arr,key,0));
    }
}
