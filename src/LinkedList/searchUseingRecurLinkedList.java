package LinkedList;

public class searchUseingRecurLinkedList {

    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
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
        // head=newNode
        head=newNode;
    }
    public void addlast(int data){
        // create a newNode
         Node newNode=new Node(data);
        if(tail==null){
            head=tail=newNode;
            return;
        }
        // tail.next=newNode
        tail.next=newNode;
        // tail=newNode
        tail=newNode;
    }
    public void print(){
        if(head==null){
            System.out.println("ll is empty");
            return;
        }
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }

    public int helper(Node head,int key){
        if(head==null){
            return -1;
        }
        if(head.data==key){
            return 0;
        }
        int idx=helper(head.next,key);
        if(idx==-1){
            return -1;
        }
        return idx+1;
    }
    public int recSearch(int key){
        return helper(head,key);
    }
      public static void main(String args[]) {
     searchUseingRecurLinkedList ss=new searchUseingRecurLinkedList();
     ss.print();
     ss.addfirst(2);
     ss.print();
     ss.addfirst(1);
     ss.print();
     ss.addlast(3);
     ss.print();
     ss.addlast(4);
     ss.print();
     ss.addlast(5);
     ss.print();
          System.out.println(ss.recSearch(5));
}
}
