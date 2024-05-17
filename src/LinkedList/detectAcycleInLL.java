package LinkedList;

public class detectAcycleInLL {
    public static class Node {
        int data;
        Node next;

        public void Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
        public static Node head;
        public static Node tail;
        public static Node size;
    public static boolean isCycle(){
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next; //+1
            fast=fast.next.next;  //+2
            if(slow==fast){
                return true;//cycle exist
            }
        }
        return false;//cycle not exist
    }
    public static void removeCycle(){
        // detect the cycle
        Node slow=head;
        Node fast=head;
        boolean cycle=false; // cycle exists nahi krti
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(fast==slow){
                cycle =true;
                break;
            }
        }
        if(cycle==false){
            return;
        }
        // find meeting point
         slow=head;
        Node prev=null; // last Node
        while(slow!=fast){
            prev=fast;
            slow=slow.next;
            fast=fast.next;
        }
        // remove cycle ->last.next=null
        prev.next=null;

    }
    public static void main(String args[]){
         head=new Node();
         Node temp=new Node();
         head.next=temp;
         head.next.next=new Node();
         head.next.next.next=temp;
         System.out.println(isCycle());
         removeCycle();
        System.out.println(isCycle());
    }
}
