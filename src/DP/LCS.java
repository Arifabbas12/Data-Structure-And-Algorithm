package DP;

public class LCS {        // recursive solution
    public static int longestCommonSeq(String str1,String str2,int n,int m){
        if(n==0 || m==0){
            return 0;
        }
        if(str1.charAt(n-1)==str2.charAt(m-1)){
            return longestCommonSeq(str1,str2,n-1,m-1)+1;
        }else{
            int ans1=longestCommonSeq(str1,str2,n,m-1);
            int ans2=longestCommonSeq(str1,str2,n-1,m);
            return Math.max(ans1,ans2);

        }

    }

    public static void main(String[] args) {
        String str1="abcde";
        String str2="abc";
        System.out.println(longestCommonSeq(str1,str2,str1.length(),str2.length()));
    }
}
