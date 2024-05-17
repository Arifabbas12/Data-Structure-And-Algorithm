package HASHING;
import java.util.*;
public class TREE_MAP {
    public static void main(String[] args) {
        TreeMap<String,Integer>tm=new TreeMap<>();   // it is sorted in alphabetical order
        tm.put("India",150);
        tm.put("China",100);
        tm.put("Iran",90);
        tm.put("America",56);
        System.out.println(tm);
    }
}
