package Array;
import java.util.*;
public class K_SUM_SubArray_MaxLen {

    // find the K sum SubArray with max Length
    public static int maxLen(int arr[],int k){
        HashMap<Integer,Integer>map=new HashMap<>();
        map.put(0,-1); // put 0 at -1 index

        int sum=0;
        int maxLength=0;

        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            int remaining=sum-k;
            if(map.containsKey(remaining)){
                int len=i-map.get(remaining);
                maxLength=Math.max(maxLength,len);
            }else{  // agr map me remaining exist nahi krta h
                if(!map.containsKey(sum)){  // if the sum not present in map then put the sum in map
                    map.put(sum,i);
                }
            }
        }
        return maxLength;
    }
    public static void main(String[] args) {
        int arr[]={10,0,0,5,2,7};
        int k=5;
        System.out.println(maxLen(arr,k));
    }
}
