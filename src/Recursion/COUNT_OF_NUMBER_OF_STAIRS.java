package Recursion;

public class COUNT_OF_NUMBER_OF_STAIRS {

    public static int fib1(int n){
        int result=0;
        if(n<=1){
            return n;
        }else{
            result=fib1(n-1)+fib1(n-2);
        }
        return result;
    }
    public static void main(String args[]){
        int n=5;
        System.out.println(fib1(n+1));
    }
}
