package DP;

public class ROD_CUTTING {   // variation of unbounded knapsack problem

    public static int rodCutting(int length[],int prices[],int rodLength){
        int n=prices.length;
        int dp[][]=new int[n+1][rodLength+1];

        //initialization
        for(int i=0;i<n+1;i++){
            dp[i][0]=0;
        }
        for(int j=0;j<rodLength+1;j++){
            dp[0][j]=0;
        }
        // main code

        for(int i=1;i<n+1;i++){
            for(int j=1;j<rodLength+1;j++){
                int v=prices[i-1];
                int w=length[i-1];
                if(w<=j){  // valid-include and exclude
                    int include=v+dp[i][j-w];
                    int exclude=dp[i-1][j];
                    dp[i][j]=Math.max(include,exclude);
                }else{ // invalid-always exclude
                    int exclude=dp[i-1][j];
                    dp[i][j]=exclude;
                }
            }
        }
        print(dp);
        return dp[n][rodLength];
    }
    // only print table
    public static void print(int dp[][]){
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                System.out.print(dp[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int length[]={1,2,3,4,5,6,7,8};
        int prices[]={1,5,8,9,10,17,17,20};
        int rodLength=8;

        System.out.println(rodCutting(length,prices,rodLength));
    }
}
