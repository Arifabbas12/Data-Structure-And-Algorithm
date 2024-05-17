package String;

public class REMOVE_OCCURRENCES {
    public static String removeOccur(String str,int idx){
        if(idx==str.length()) return " ";
        String smallAns=removeOccur(str,idx+1);
        char currChar=str.charAt(idx);
        if(currChar!='a'){
            return currChar+smallAns;
        }else{
            return smallAns;
        }
    }
    public static void main(String[] args) {
        String str="abcadx";
        System.out.println(removeOccur(str,0));
    }
}
