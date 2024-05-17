package Recursion;

public class printDigit {  //recursion -assignment question
    static String digits[]={"zero","one","two","three","four","five","six","seven","eight","nine"};
    public static void printDigits(int number){
        if(number==0){
            return;
        }
         int lastDigit=number%10;
        printDigits(number/10);
        System.out.println(digits[lastDigit]+" ");
    }
    public static void main(String args[]){
        printDigits(12345);
        System.out.println();
    }
}
