package stack;
import java.util.*;
public class StackUsingQueue {
    static class Stack{
        static Queue<Integer>q=new LinkedList<>();

       public static boolean isEmpty(){
           return q.isEmpty();
       }
       // push
        public static void push(int data){
           if(q.isEmpty()){
               q.add(data);
           }else{
               q.add(data);
               for(int i=1;i<=q.size()-1;i++){
                   q.add(q.remove());
               }
           }
        }
        // pop
        public static int pop(){
           if(q.isEmpty()){
               System.out.println("Queue is Empty");
               return -1;
           }
           return q.remove();
        }
        // peek
        public static int peek(){
           if(q.isEmpty()){
               System.out.println("Queue is empty");
               return -1;
           }
           return q.peek();
        }
    }

    public static void main(String[] args) {
        Stack s=new Stack ();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}
