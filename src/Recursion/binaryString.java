package Recursion;

public class binaryString {  // this program is without consecutive ones
    public static void printBinString(int n,int lastPlace,String str){
        if(n==0){
            System.out.println(str);
            return;
        }
        printBinString(n-1,0,str+"0");   // mere string me 0 kewal agle level ke liye add hua h
        if(lastPlace==0){
            printBinString(n-1,1,str+"1"); // mere string me 1 kewal agle level ke liye add hua h
        }
    }
    public static void main(String args[]){
        printBinString(3,0,"");
    }
}
