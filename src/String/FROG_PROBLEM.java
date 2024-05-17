package String;
public class FROG_PROBLEM {
    public static int jump(int h[],int n,int idx){
        // base case
        if(idx==n-1) return 0;

        int first_jump=jump(h,n,idx+1)+Math.abs(h[idx]-h[idx+1]);
        if(idx==n-2) return first_jump;
        int second_jump=jump(h,n,idx+2)+Math.abs(h[idx]-h[idx+2]);

        return Math.min(first_jump,second_jump);
    }
    public static void main(String[] args) {
        int h[]={10,30,40,10};
        System.out.println(jump(h,h.length-1,0));
    }
}
