package Recursion;

public class subSetBa {
    public static void printSubset(String str,int i,String newString){
        // base case
        if(i==str.length()){
            System.out.println(newString);
            return;
        }
        // recursion
        char currChar=str.charAt(i);
        printSubset(str,i+1,newString+currChar); // to be add or yes choice
        printSubset(str,i+1,newString);// not be add or no choice
    }
    public static void main(String args[]){
        String str="abc";
        printSubset(str,0," ");
    }
}
