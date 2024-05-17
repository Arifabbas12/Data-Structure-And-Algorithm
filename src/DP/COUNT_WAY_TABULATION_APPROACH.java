package DP;

public class COUNT_WAY_TABULATION_APPROACH {
    public static int CountWay(int n){
        int dp[]=new int[n+1];
        dp[0]=1;
        for(int i=1;i<=n;i++){
            if(n==1){
                dp[i]=dp[n-1]+0;
            }else {
                dp[i] = CountWay(n - 1) + CountWay(n - 2);
            }
        }
     return dp[n];
    }
    public static void main(String[] args) {
        int n=5;
        System.out.println(CountWay(n));
    }
}
