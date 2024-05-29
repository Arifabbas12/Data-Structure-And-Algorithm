package Array;

import java.util.*;
public class Longest_Length_subArray_sum {
//   Find Longest length subArray with sum divisible by k

    public static int subArray(int arr[],int k){

        int sum=0;
        int maxLength=0;
        HashMap<Integer,Integer>hm=new HashMap<>();
        hm.put(0,-1);  // put 0 at -1 index

        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            int rem=sum%k;  // find reminder
            if(hm.containsKey(rem)){
                int length=i-hm.get(rem);   // UpperLimit-LowerLimit
                maxLength=Math.max(maxLength,length);
            }else{
                hm.put(rem,i);
            }
        }
        return maxLength;
    }
    public static void main(String[] args) {
        int arr[]={2,7,6,1,4,5};
        int k=3;
        System.out.println(subArray(arr,k));
    }
}
