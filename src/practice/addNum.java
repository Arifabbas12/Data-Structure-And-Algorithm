package practice;

public class addNum {
    public static void main(String args[]) {
//        int Array.sum=0;
//        int f=1;
//        for(int i=1;i<=5;i++){
//            f=f*i;
//            Array.sum=Array.sum+f;
//        }
//        System.out.println(Array.sum);
//        int f=1;
//        for(int i=1;i<=5;i++){
//            f*=i;
//        }
//        System.out.println(f);
//
//        int n=5;
//        int result=0;
//        for(int i=1;i<=n;i++){
//            int term=f;
//            if(i%2==0){
//                result-=term;
//            }else{
//                result+=term;
//            }
//        }
//        System.out.println(result);
        // 1!-2!+3!-4!+5!
                int n = 5; // Number of terms
                int sum = 0;
                int f=1;
                for (int i = 1; i <= n; i++) {
                    f=f*i;
                    if (i % 2 == 0) {
                        sum -= f;
                    } else {
                        sum += f;
                    }
                }

                System.out.println("Result: " + sum);
            }
    }




