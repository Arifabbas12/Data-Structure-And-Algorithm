package Array;

public class kadane {
    public static void kadanes(int numbers[]){
        int Maxsum=Integer.MIN_VALUE;
        int currsum=0;
        for(int i=0;i<numbers.length;i++){
            currsum+=numbers[i];
            if(currsum<0){
                currsum=0;
            }
            Maxsum=Math.max(currsum,Maxsum);
        }
        System.out.println("the maxSum is :"+Maxsum);
        }
    public static void main(String args[]){
        int numbers[]={2,3,4,5,2,1,6,7};
        kadanes(numbers);
    }
}
