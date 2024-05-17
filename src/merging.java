public class merging {
    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void mergeSort(int arr[],int si,int ei){
        if(si<ei) {
            int mid = (si+ei)/2;
            mergeSort(arr, si, mid); // left part
            mergeSort(arr, mid + 1, ei); // right part
            merging(arr, si, mid, ei);
        }
    }
    public static void merging(int arr[],int si,int mid,int ei){
        int temp[]=new int[ei-si+1];
        int i=si; // iterate for left part
        int j=mid+1; // iterate for right part
        int k=0; // iterate for temp part

        while(i<=mid && j<=ei){
            if(arr[i]<arr[j]){
                temp[k]=arr[i];
                i++;
            }else{
                temp[k]=arr[j];
                j++;
            }
            k++;
        }
        // left part
        if(i<=mid) {
            while (i <= mid) {
                temp[k] = arr[i];
                i++;
                k++;
            }
        }
        // right part
        if(j<=ei) {
            while (j <= ei) {
                temp[k] = arr[j];
                j++;
                k++;
            }
        }
        // copy temp to original Array
        for( k=0,i=si;k<temp.length;k++,i++){
            arr[i]=temp[k];
        }
    }
    public static void main(String[] args) {
        int arr[]={6,3,9,5,2,8};
        mergeSort(arr,0,arr.length-1);
        printArr(arr);
    }
}
