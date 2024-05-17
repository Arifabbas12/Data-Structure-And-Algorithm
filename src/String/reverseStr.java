package String;

public class reverseStr {
    public static String printStr(String str,String newStr){
        for(int i=str.length()-1;i>=0;i--){
            char ch=str.charAt(i);
            newStr+=ch;
        }
        return newStr;
    }
    public static void main(String[] args) {
        String str="abdx";
        System.out.println(printStr(str,""));
    }
}
