package Array;

public class INSERT_AN_ELEMENT_IN_ARRAY {
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50};
        int pos=4;
        int element=100;
        for(int i=arr.length-1;i>pos-1;i--){
            arr[i]=arr[i-1];
        }
        arr[pos-1]=element;
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
