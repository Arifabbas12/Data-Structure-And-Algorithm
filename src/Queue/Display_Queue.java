package Queue;

import java.util.*;

public class Display_Queue {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        Queue<Integer> helper = new LinkedList<>();
        while (!q.isEmpty()) {
            System.out.print(q.peek() + " ");
            helper.add(q.remove());
        }
        while(!helper.isEmpty()){
            q.add(helper.remove());
        }
    }
}
