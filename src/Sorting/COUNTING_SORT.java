package Sorting;
public class COUNTING_SORT {
    public static int findMax(int arr[]){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    public static void countSort(int arr[]){
        int n=arr.length;
        int output[]=new int[n];
        // find the largest element of the array
        int max=findMax(arr);
        int count[]=new int[max+1];
        for(int i=0;i<arr.length;i++){ // make frequency array
            count[arr[i]]++;
        }
        // make prefixSum Array of the count Array
        for(int i=1;i<count.length;i++){
            count[i]+=count[i-1];
        }
        // find the index of each element in original array and put it in output array
        for(int i=arr.length-1;i>=0;i--){
            int idx=count[arr[i]]-1;
            output[idx]=arr[i];
            count[arr[i]]--;
        }
        // copy all element of output to array
        for(int i=0;i<n;i++){
            arr[i]=output[i];
        }
    }
    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[]={0,1,0,3,4,3,1,2,4,2};
        System.out.println("Original Array");
        printArray(arr);
        countSort(arr);
        System.out.println("Sorted Array");
        printArray(arr);
    }
}
