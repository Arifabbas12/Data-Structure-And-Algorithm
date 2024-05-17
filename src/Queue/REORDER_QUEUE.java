package Queue;

import java.util.*;

public class REORDER_QUEUE {
    public static void main(String[] args) {
        Queue<Integer>q=new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        System.out.println(q);
        Stack<Integer>s=new Stack<>();
        // remove the first Half from queue
        int n=q.size();
        for(int i=1;i<=n/2;i++){
            s.push(q.remove());
        }
        while(!s.isEmpty()){
            q.add(s.pop());
        }
        // remove again first half from queue
        for(int i=1;i<=n/2;i++){
            s.push(q.remove());
        }
        while(!s.isEmpty()){
            q.add(s.pop());
            q.add(q.remove());
        }
        while(!q.isEmpty()){
            s.push(q.remove());
        }
        while(!s.isEmpty()){
            q.add(s.pop());
        }
        System.out.println(q);
    }
}
