package Array;
public class FIRST_OCCURANCE {
    public static int first(int arr[],int target){
        int start=0;
        int end=arr.length-1;
        int result=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                result=mid;
                end=mid-1;
            }else if(arr[mid]>target){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int arr[]={2,4,5,5,7,8,9,9};
        int target=5;
       int result=first(arr,target);
        System.out.println(result);
    }
}
