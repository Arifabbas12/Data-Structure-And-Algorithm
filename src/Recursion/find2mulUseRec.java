package Recursion;

public class find2mulUseRec {
    public static void printRec(int n){
        // base case
        if(n==2){
            System.out.println(n);
            return;
        }
        printRec(n-2);
        System.out.println(n+"");
        if(n%4==0){
            System.out.println("arif");
        }
        }
    public static void main(String args[]){
        int n=20;
        printRec(n);
    }
}
