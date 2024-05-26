package Array;

public class Find_min_num_of_merge_operation_to_make_palindrome {

    public static int min(int arr[]){   // geeks for geeks question
        int ans=0;
        int n=arr.length;
        int i=0;
        int j=n-1;

        while(i<=j){
            if(arr[i]==arr[j]){
                i++;
                j--;
            }else if(arr[i]<arr[j]){
                i++;
                arr[i]+=arr[i-1];
                ans++;
            }else{
                j--;
                arr[j]+=arr[j+1];
                ans++;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[]={11,14,15,99};
        System.out.println(min(arr));

    }
}
