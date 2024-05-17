package Sorting;

import java.util.Arrays;
public class inbuilt {
    //print
    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String args[]){
        int arr[]={5,3,2,1,4};
       Arrays.sort(arr);
       // Arrays.sort(arr);
        printArray(arr);

    }
}
