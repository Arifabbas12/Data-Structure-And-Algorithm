package DP;

public class Fibonacci {

    // memoization(top-down)->recursive approach->0(n)
    public static int fib(int n,int f[]){
        if(n==0 || n==1){
            return n;
        }
        if(f[n]!=0){  // fib(n) is already calculate
            return f[n];
        }
        f[n]= fib(n-1,f)+fib(n-2,f);
        return f[n];
    }

    // tabulation(bottom-up) ->iterative approach->0(n)
    public static int fib1(int n){
        int dp[]=new int[n+1];
        dp[0]=0;
        dp[1]=1;
        dp[2]=1;
        for(int i=3;i<=n;i++){
            dp[i]=dp[i-1]+dp[i-2]+dp[i-3];
        }
        return dp[n];
    }
    public static void main(String[] args) {
        int n=4;
        int f[]=new int[n+1];
        System.out.println(fib(n,f));
        System.out.println(fib1(n));
    }
}
