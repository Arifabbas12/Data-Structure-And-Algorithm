package Recursion;

public class printSubsequence {
    public static void subSequences(String str,int idx,String newString){
        if(idx==str.length()){
            System.out.println(newString);
            return;
        }
        // to be add
        char currChar=str.charAt(idx);
        subSequences(str,idx+1,newString+currChar);
        // to not be add
        subSequences(str,idx+1,newString);
    }
    public static void main(String args[]){
        String str="abc";
        subSequences(str,0,"");
    }
}
