package stack;

import java.util.*;
public class ReverseStringUsingStack extends Thread {
    public static String reverseString(String str,String newString){
      Stack<Character>s=new Stack<>();
      int idx=0;
      while(idx<str.length()){
          s.push(str.charAt(idx));
          idx++;
      }
      while(!s.isEmpty()){
          char ch=s.pop();
          newString+=ch;
      }
      return newString;
    }
    public static void main(String args[]){
        String str="sabbA firA";
        System.out.println(reverseString(str,""));
    }
}
