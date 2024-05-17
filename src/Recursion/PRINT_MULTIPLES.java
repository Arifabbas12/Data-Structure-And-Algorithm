package Recursion;

public class PRINT_MULTIPLES {
    public static void mul(int n,int k){
        // base case
        if(k==0) return;
        // call
        mul(n,k-1);
        // self work
        System.out.println(n*k);
    }
    public static void main(String[] args) {
         int n=5;
         mul(n,10);
    }
}
