package HASHING;
import java.util.*;
public class ITERATION_ON_HASHMAP {
    public static void main(String[] args) {
        HashMap<String,Integer>hm=new HashMap<>();
        // insert
        hm.put("India",150);
        hm.put("china",100);
        hm.put("Iran",70);
        hm.put("Nepal",50);
        hm.put("Us",60);

        // iteration
        Set<String>key=hm.keySet();
        System.out.println(key);

        for(String k :key){
            System.out.println("key="+k+",value="+hm.get(k));
        }
    }
}
