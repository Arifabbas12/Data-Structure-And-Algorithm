package Array;

import java.util.Scanner;
public class Nprint {
    public static void printnum(int arr[]){
        int evensum=0;
        int oddsum=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                evensum+=arr[i];
            }else{
                oddsum+=arr[i];
            }
        }
        System.out.println(evensum);
        System.out.println(oddsum);
    }
    public static void main(String[] args) {
        int arr[]={1,3,4,5,7,8};
        printnum(arr);

    }
}
