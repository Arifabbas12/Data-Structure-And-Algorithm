package Array;

public class sub {
    public static void SubArray(int numbers[]) {
        int sum=0;
        int maxSum=0;
        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            for (int j = i; j < numbers.length; j++) {
                int end = j;
                sum=0;
                for (int k = start; k <= end; k++) {
                    System.out.print(numbers[k] + " ");
                    sum+=numbers[k];
                }
                System.out.println("->Array.sum is :"+sum);
                maxSum=Math.max(maxSum,sum);
            }
            System.out.println();
        }
        System.out.println("MaxSum is ->"+maxSum);

    }

    public static void main(String args[]){
        int numbers[]={2,4,6,8,10};
        SubArray(numbers);
    }
}
