package Recursion;

public class dec {
   // public static void printDec(int n){   // decreasing the number from recursion
       // if(n==1){
           // System.out.println(n);
         //   return;
       // }
       // System.out.print(n+" ");
      //  printDec(n-1);

  //  }
    public static void printInc(int n){   // increasing the number from recursion
        if(n==1){
            System.out.print(n+" ");
            return;
        }

        printInc(n-1);
        System.out.print(n+" ");
    }
    public static void main(String args[]){
      int n=10;
      printInc(n);
    }
}
