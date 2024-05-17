package Recursion;

public class optimizedpower {          //Recursion
    public static int optimized(int x,int n){
        if(n==0){
            return 1;
        }

        // here n is even
        int halfpowersq=optimized(x,n/2)*optimized(x,n/2);// we can write it like: int halfpower=optimized(x,n/2);
                                                                  // int halfpowersq=halfpower*halfpower;
        // here n is odd
        if(n%2!=0){  // x*optimized(x,n/2)*optimized(x,n/2)=x*(x Recursion.power n/2)*(x Recursion.power n/2)
            halfpowersq=x*halfpowersq;
        }
        return halfpowersq;
    }
    public static void main (String args[]){
        int x=2;
        int n=11;
        System.out.println(optimized(x,n));
    }
}
