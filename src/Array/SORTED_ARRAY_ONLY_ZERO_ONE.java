package Array;

public class SORTED_ARRAY_ONLY_ZERO_ONE {
    public static void sorted(int arr[]){
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                count++;
            }
        }
        // 0 to count-1 tk 0 put karna h
        for(int i=0;i<arr.length;i++){
            if(i<count){
                arr[i]=0;
            }else{
                arr[i]=1;
            }
        }
    }
    public static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[]={1,0,1,0,1,0,1,0,1,0};
        sorted(arr);
        print(arr);

    }
}
