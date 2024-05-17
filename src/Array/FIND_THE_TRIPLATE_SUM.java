package Array;
import java.util.*;
public class FIND_THE_TRIPLATE_SUM {
    public static int sum(int arr[],int target){
        int count=0;
//        int n=arr.length;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                for(int k=j+1;k<arr.length;k++){
                    if(arr[i]+arr[j]+arr[k]==target){
                        count++;
                    }
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        int arr[]=new int[n];
//        for(int i=0;i<n;i++){
//            arr[i]=sc.nextInt();
//        }
//        int target=sc.nextInt();
        int arr[]={1,2,3,5,6};
        int target=10;
        System.out.println(sum(arr,target));
    }
}
