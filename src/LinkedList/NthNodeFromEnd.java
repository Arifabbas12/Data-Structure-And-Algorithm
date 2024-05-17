package LinkedList;

public class NthNodeFromEnd {
    static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node NthNode(Node head,int n){
        Node slow=head;
        Node fast=head;
        for(int i=1;i<=n;i++){
            fast=fast.next;
        }
        while(fast!=null){
            slow=slow.next;
            fast=fast.next;
        }
        return slow;
    }
//    public static Node nthNode(Node head,int n){
//        int sz=0;
//        Node temp=head;
//        while(temp!=null){
//            temp=temp.next;
//            sz++;
//        }
//        int i=1;
//        temp=head;
//        int fToFind=sz-n+1;
//        while(i<fToFind){
//            temp=temp.next;
//            i++;
//        }
//        return temp;
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
       Node q= NthNode(a,2);
        System.out.println(q.data);

    }
}
