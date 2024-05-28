package Array;
import java.util.*;
public class Find_K_SUM_SUBARRAY_EXISTS {
    public static boolean sumSub(int arr[],int k){
        int sum=0;
        HashSet<Integer>hs=new HashSet<>();
        hs.add(0);

        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            int remaining=sum-k;
            if(hs.contains(remaining)){
                return true;
            }
            hs.add(sum);
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[]={2,8,2,6,-6,3,2};
        int k=5;
        System.out.println(sumSub(arr,k));
    }
}
