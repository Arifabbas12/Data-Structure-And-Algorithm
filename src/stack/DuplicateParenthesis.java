package stack;

import java.util.*;
public class DuplicateParenthesis {
    public static boolean isDuplicate(String str){
        Stack<Character>s=new Stack<>();

        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            // closing
            if(ch==')'){
                int count=0;
                while(s.peek()!='('){ // when till my top has been ( ->opening
                    s.pop();
                    count++;
                }
                if(count<1){
                    return true; // duplicate value exist krta h
                }else{
                    s.pop();// opening pair
                }
            }else{
                // opening
                s.push(ch);
            }
        }
        return false;
    }
    public static void main(String args[]){
        String str="((a+b))"; // duplicate exist krta h
        String str2="(a-b)";  // duplicate exist nahi krta h
        System.out.println(isDuplicate(str));
        System.out.println(isDuplicate(str2));
    }
}
