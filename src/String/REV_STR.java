package String;

public class REV_STR {
    public static String rev(String str,int idx){
        if(idx==str.length()) return "";
        String smallAns=rev(str,idx+1);
        return smallAns+str.charAt(idx);
    }
    public static void main(String[] args) {
        String str="abcd";
        System.out.println(rev(str,0));
    }
}