package LinkedList;

public class DISPLAY_LINKED_LIST {
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static void display(Node head){
        if(head==null) return;
        System.out.print(head.data+" ");
        display(head.next);
    }
    public static void main(String[] args) {
        Node a=new Node(100);
        Node b=new Node(12);
        Node c=new Node(13);
        Node d=new Node(11);
        Node e=new Node(10);

        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=null;
        display(a);

    }
}
