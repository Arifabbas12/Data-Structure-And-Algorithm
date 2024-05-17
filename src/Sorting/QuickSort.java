package Sorting;

public class QuickSort {
    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void quickSort(int arr[],int si,int ei){
        // base case
        if(si>=ei){
            return;
        }
        //partition-> pivot ko sahi idx per rkh dega or uske bad vo pivot se chhote ele ko aage oe bade ko picche baitha dega
          int pidx=partition(arr,si,ei);
        quickSort(arr,si,pidx-1); // left part
        quickSort(arr,pidx+1,ei);  // right part
    }
    public static int partition(int arr[],int si,int ei){
        int pivot=arr[ei];
        int i=si-1; // you make a place for ele for smaller than pivot
        for(int j=si;j<ei;j++){
            if(arr[j]<=pivot){
                i++;
                // swap
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
        }
        // pivot ko sahi jagah place ke liye
        i++;
        int temp=pivot;
        arr[ei]=arr[i];
        arr[i]=temp;
        return i;
    }
    public static void main(String args[]){
        int arr[]={2,11,4,6,5,8};
        quickSort(arr,0,arr.length-1);
        printArr(arr);

    }
}
