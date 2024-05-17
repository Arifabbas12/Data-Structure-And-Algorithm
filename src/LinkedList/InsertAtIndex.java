package LinkedList;

public class InsertAtIndex {
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
    public static void print(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public static void insertAtIdx(Node head,int idx,int val){
       Node temp=head;
       for(int i=1;i<=idx-1;i++){
           temp=temp.next;
       }
      Node r=temp.next;
       Node newNode=new Node(val);
       temp.next=newNode;
       newNode.prev=temp;
       newNode.next=r;
       r.prev=newNode;
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
        print(a);
        insertAtIdx(a,3,98);
        print(a);
    }
}
