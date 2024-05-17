package practice;

public class binTodec {
    //public static void BinToDec(int binNum){
       // int mynum=binNum;
       // int pow=0;
       // int decNum=0;
        //while(binNum>0) {
         //   int lastdigit = binNum % 10;
          //  decNum = decNum + (lastdigit * (int) Math.pow(2, pow));
          //  pow++;
           // binNum = binNum / 10;
       // }
        //System.out.println("decNum of"+mynum+"="+decNum);
   // }
    public static void DecToBin(int decNum){
        int mynum=decNum;
        int pow=0;
        int binNum=0;
        while(decNum>0){
            int rem=decNum%2;
            binNum=binNum+(rem*(int)Math.pow(10,pow));
            pow++;
            decNum=decNum/2;
        }
        System.out.println("Array.binary of"+mynum+"="+binNum);
    }
    public static void main(String args[]){
        //int binNum=1010;
        //BinToDec(binNum);
        int decNum=7;
        DecToBin(decNum);

    }
}
