package HASHING;
import java.util.*;
public class HASH_SET {
    public static void main(String[] args) {
        HashSet<Integer>hs=new HashSet<>();
        // add
        hs.add(1);
        hs.add(2);
        hs.add(3);
        hs.add(2);
        hs.add(3);
        hs.add(4);

        System.out.println(hs);

        // size
        System.out.println(hs.size());

        // remove
        hs.remove(4);
        System.out.println(hs);

        // isEmpty
        System.out.println(hs.isEmpty());

        // contains
        if(hs.contains(2)){
            System.out.println("Hs contains 2");
        }
        if(hs.contains(4)){
            System.out.println("Hs contain 5");

            // clear
            hs.clear();
            System.out.println(hs);


        }
    }
}
