package HASHING;
import java.util.HashMap;
public class HASH_MAP {
    public static void main(String[] args) {
        // create
        HashMap<String,Integer>hm=new HashMap<>(); // it always in UnOrdered
        // insert - O(1)
        hm.put("India",150);
        hm.put("China",145);
        hm.put("Iran",70);
        System.out.println(hm);

        // get - O(1)
       int Population= hm.get("India"); // 150
        System.out.println(Population);
        System.out.println(hm.get("Indonesia")); // Null

        // ContainsKey - O(1)
        System.out.println(hm.containsKey("India")); // True
        System.out.println(hm.containsKey("Iraq"));  // False

        // remove - O(1)
        System.out.println(hm.remove("China")); // 145
        System.out.println(hm);

        // size
        System.out.println(hm.size()); // 2

        // IsEmpty
        System.out.println(hm.isEmpty()); // false

        // clear
        hm.clear();
        System.out.println(hm.isEmpty()); // true
    }
}
