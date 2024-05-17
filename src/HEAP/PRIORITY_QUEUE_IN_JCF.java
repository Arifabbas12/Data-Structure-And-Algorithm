package HEAP;
import java.util.*;
public class PRIORITY_QUEUE_IN_JCF {
    public static void main(String[] args) {
        PriorityQueue<Integer>pq=new PriorityQueue<>();
        pq.add(4);
        pq.add(3);
        pq.add(5);
        pq.add(2);
        pq.add(1);
        pq.add(6);

        while(!pq.isEmpty()){
            System.out.println(pq.peek());
            pq.remove();
        }
    }
}
