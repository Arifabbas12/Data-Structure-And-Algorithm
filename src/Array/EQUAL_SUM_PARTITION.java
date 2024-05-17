package Array;

public class EQUAL_SUM_PARTITION {
    static int totalSum(int arr[]){
        int tos=0;
        for(int i=0;i<arr.length;i++){  // tos->total sum
            tos+=arr[i];
        }
        return tos;
    }
    static boolean partition(int arr[]){
        int totalSum=totalSum(arr);
        int prefixSum=0;
        for(int i=1;i<arr.length;i++){
            prefixSum+=arr[i];
            int suffixSum=totalSum-prefixSum;
            if(suffixSum==prefixSum){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,1,3,3};
        System.out.println(partition(arr));
    }
}
