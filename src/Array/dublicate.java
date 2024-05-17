package Array;

public class dublicate {
    public static void findDub(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]<arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
                if((arr[i]==arr[j])&& (i!=j) ){
                    System.out.println(arr[j]);
                }
            }
        }
    }
    public static void main(String args[]){
        int arr[]={1,2,3,4,5,3,2};
        findDub(arr);

    }
}
