package Sorting;

import java.util.Arrays;

public class CYCLIC_SORT {
    public static void main(String[] args) {
        int arr[]={5,4,2,1,3};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void sort(int arr[]){
        int i=0;
        while(i<arr.length){
            int correctPos=arr[i]-1;
            if(arr[i]!=arr[correctPos]){
                swap(arr,i,correctPos);
            }else{
                i++;
            }
        }
    }
    public static void swap(int arr[],int first,int last){
        int temp=arr[first];
        arr[first]=arr[last];
        arr[last]=temp;
    }
}
