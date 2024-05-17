package Queue;
import java.util.*;
public class binaryConversion {
    public static void binary(int n){
        int i=1;
            Queue<Integer> q = new LinkedList<>();
            q.add(i);
            while (!q.isEmpty() && i<=n) {
                System.out.println(q.peek());
                q.add(q.peek() * 10 + 0);
                q.add(q.peek() * 10 + 1);
                q.remove();
                i++;
            }
        }
    public static void main(String[] args) {
        binary(10);
    }
}
