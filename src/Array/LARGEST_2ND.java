package Array;

public class LARGEST_2ND {
    public static int FindLargest(int arr[]){
       int largest=Integer.MIN_VALUE;
       for(int i=0;i<arr.length;i++){
           if(arr[i]>largest){
               largest=arr[i];
           }
       }
       return largest;
    }
    public static int secondLargest(int arr[]){
       int largest=FindLargest(arr);
       for(int i=0;i<arr.length;i++){
           if(arr[i]==largest)  arr[i]=Integer.MIN_VALUE;
       }
       int secondLargest=FindLargest(arr);
       return secondLargest;
    }
    public static void main(String[] args) {
        int arr[]={1,5,7,8,9,4,2};
        System.out.println(secondLargest(arr));

    }
}
