package HASHING;
import java.util.*;
public class LARGEST_SubARRAY_WITH_0_SUM {
    public static void main(String[] args) {
        int arr[]={15,-2,2,-8,1,7,10,23};
        HashMap<Integer,Integer>map=new HashMap<>();
        // (sum,idx)
        int sum=0;
        int len=0;
        for(int j=0;j<arr.length;j++){
            sum+=arr[j];
            if(map.containsKey(sum)){
                len=Math.max(len,j-map.get(sum));
            }else{
                map.put(sum,j);
            }
        }
        System.out.println("Largest SubArray with 0 as Sum="+len);
    }
}
