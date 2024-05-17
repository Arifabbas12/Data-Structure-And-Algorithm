package String;

public class CompressSting {
    public static String compress(String str, String newString) {
       for(int i=0;i<str.length();i++){
           Integer count=1;
           while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
               count++;
               i++;
           }
           newString+=str.charAt(i);
           if(count>0){
               newString+=count.toString();
           }
       }
       return newString;
    }
    public static void main(String[] args) {
        String str = "aaabbbcccdddf";
        System.out.println(compress(str, ""));
    }
}

