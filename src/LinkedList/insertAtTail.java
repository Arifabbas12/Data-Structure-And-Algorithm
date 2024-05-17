package LinkedList;

public class insertAtTail {
    static class Node{
        int data;
        Node next;
        Node prev;

        public Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }
    public static void display(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public static void insertAtTail(Node head,int x){
       Node temp=head;
       while(temp.next!=null){
           temp=temp.next;
       }
       Node newNode=new Node(x);
       temp.next=newNode;
       newNode.prev=temp;
    }

    public static void main(String[] args) {
        Node a=new Node(4);
        Node b=new Node(10);
        Node c=new Node(2);
        Node d=new Node(99);
        Node e=new Node(13);
        a.next=b;
        b.prev=a;
        b.next=c;
        c.prev=b;
        c.next=d;
        d.prev=c;
        d.next=e;
        e.prev=d;
        display(a);
        insertAtTail(a,50);
        display(a);
    }
}
