package Array;

public class Missing_Number {
    public static void main(String[] args) {
        int arr[]={1,2,3,6,5};
        int n=arr.length;

        // sum of natural number
        int naturalNumber=((n+1)*(n+2))/2;

        // sum of the current Array
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
        }
       int missingNumber=naturalNumber-sum;
        System.out.println(missingNumber);
    }
}
