package LinkedList;

public class reverse {
    static  class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static void displayRev(Node head){
        if(head==null){
            return;
        }
       displayRev(head.next);
        System.out.print(head.data+" ");
    }
//    public static void display(Node head){
//        if(head==null){
//            return;
//        }
//        System.out.println(head.data+" ");
//        display(head.next);
//    }

    public static void main(String[] args) {
        Node a=new Node(100);
        Node b=new Node(13);
        Node c=new Node(4);
        Node d=new Node(5);
        Node e=new Node(12);
        Node f=new Node(10);

        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
        displayRev(a);
//        display(a);
    }
}
