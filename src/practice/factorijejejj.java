package practice;

public class factorijejejj {
    public static void main(String args[]){
        int n=11;
        if(n%2!=0){
            for(int i=1;i<=10;i++){
                System.out.println(n*i);
            }
        }else{
            int sum=0;
            while(n>0){
                int rem=n%10;
                sum+=rem;
                n=n/10;
            }
            System.out.println(sum);
        }
    }
}
