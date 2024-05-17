package Array;

public class KthLargest {
    public static void kthLar(int arr[],int k){
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
            if(i==k-1){ // k=4 but the value will come on 3 index
                System.out.println(arr[i]);
            }

        }
    }
    public static void main(String args[]){
        int arr[]={12,1,10,8,5,4,3,6};
        int k=4;
        kthLar(arr,k);
    }
}
