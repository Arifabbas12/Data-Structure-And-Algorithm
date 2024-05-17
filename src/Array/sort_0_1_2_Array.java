package Array;

public class sort_0_1_2_Array {
    public static void main(String[] args) {
        int arr[]={1,2,0,2,1,0};
        int a0=0;
        int b0=0;
        int c0=0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]==0) a0++;
            else if(arr[i]==1) b0++;
            else c0++;
        }
        int k=0;
        for(int i=0;i<a0;i++) arr[k++]=0;
        for(int i=0;i<b0;i++) arr[k++]=1;
        for(int i=0;i<c0;i++) arr[k++]=2;

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
