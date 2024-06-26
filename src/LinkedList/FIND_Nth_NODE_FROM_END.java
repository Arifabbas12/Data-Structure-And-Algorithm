package LinkedList;

public class FIND_Nth_NODE_FROM_END {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node NthNode(Node head,int n){
//        int size=0; // first method to find nth node from end
//        Node temp=head;
//        while(temp!=null){
//            size++;
//            temp=temp.next;
//        }
//        int m=size-n+1;
//         temp=head;
//        // mth node from start
//        for(int i=1;i<=m-1;i++){
//            temp=temp.next;
//        }
//        return temp;


      // 2nd method to find nth node from end

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
    public static void main(String[] args) {
        Node a=new Node(100);
        Node b=new Node(13);
        Node c=new Node(20);
        Node d=new Node(78);
        Node e=new Node(10);
        Node f=new Node(11);

        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;

        Node q=NthNode(a,3);
        System.out.println(q.data);

    }
}
