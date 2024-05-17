package practice;

public class fabonacciNumber {
        public static void main(String[] args) {
            int n = 10; // Change this value to find a different Fibonacci number
            int first = 0;
            int second = 1;
            System.out.println(first+" "+second);
            int fibonacci=0;
            int i=1;
            while(i<=n){
                fibonacci=first+second;
                System.out.println(fibonacci);
                first=second;
                second=fibonacci;
                i++;
            }
            System.out.print("The " + n + "th Fibonacci number is: " + fibonacci);
        }
    }


