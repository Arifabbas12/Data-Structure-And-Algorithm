package LinkedList;

public class FindMidElement {
    static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node findMid(Node head){
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public static void print(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node a=new Node(100);
        Node b=new Node(10);
        Node c=new Node(40);
        Node d=new Node(50);
        Node e=new Node(60);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        print(a);
       c= findMid(head);
       print(c);
    }
}
