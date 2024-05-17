package LinkedList;

public class DoubleLL {
    public static class Node{
        int data;
        Node next;
        Node prev;
        public Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }
    public static Node head;
    public static Node tail;
    public static Node size;

    public void addfirst(int data){
        // create a newNode
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
            return;
        }
        // newNode.next=head;
        newNode.next=head;
        head.prev=newNode;
        // head=newNode
        head=newNode;
    }
    public void print(){
        if(head==null){
            System.out.println("dll is empty");
            return;
        }
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public void reverse(){
        Node curr=head;
        Node prev=null;
        Node next;

        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            curr.prev=next;
            prev=curr;
            curr=next;
        }
        head=prev;
    }
    public static void main(String args[]){
        DoubleLL dll=new DoubleLL();
        dll.addfirst(3);
        dll.addfirst(2);
        dll.addfirst(1);
        dll.print();
        dll.reverse();
        dll.print();

    }
}
