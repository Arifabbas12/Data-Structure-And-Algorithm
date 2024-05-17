package Array;

public class pairs {
    public static void pairs(int numbers[]){
        int sum=0;
        int tp=0;
        for(int i=0;i<numbers.length;i++){
            int curr=numbers[i];
            for(int j=i+1;j<numbers.length;j++){
                System.out.print("("+curr+","+numbers[j]+")");
                 sum=curr+numbers[j];
                tp++;
                System.out.print("->"+sum);
            }
            System.out.println();
        }
        System.out.println("the total Array pairs is :"+tp);
    }
    public static void main(String args[]){
        int numbers[]={2,3,4,5,6};
        pairs(numbers);
    }
}
