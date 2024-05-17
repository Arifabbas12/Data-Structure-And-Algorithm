package Array;

import java.util.Scanner;
public class array {
    public static void main(String ars[]){
        int marks[]=new int[5];
        Scanner sc=new Scanner(System.in);
        marks[2]=sc.nextInt();//phy
        marks[3]=sc.nextInt();//che
        marks[4]=sc.nextInt();//math
        System.out.println("phy is :"+ marks[2]);
        System.out.println("che is :"+ marks[3]);
        System.out.println("math is :"+ marks[4]);

    }
}
