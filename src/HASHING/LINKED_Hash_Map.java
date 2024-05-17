package HASHING;
import java.util.*;
public class LINKED_Hash_Map {
    public static void main(String[] args) {
        LinkedHashMap<String,Integer>lhm=new LinkedHashMap<>();     // it is always come in ordered
        lhm.put("India",120);
        lhm.put("China",150);
        lhm.put("Iran",90);
        lhm.put("Usa",70);
        System.out.println(lhm);
    }
}
