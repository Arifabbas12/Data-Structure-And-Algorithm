package Array;

public class FIND_Square_Root {
    public static int squareRoot(int num){
        int low=0;
        int high=num;
        int result=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            long val=mid*mid;
            if(val==num){
                return mid;
            }else if(val<num){
                result=mid;
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int num=25;
        System.out.println(squareRoot(num));
    }
}
