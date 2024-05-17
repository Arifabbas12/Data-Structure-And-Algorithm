package LinkedList;

public class pelindromLinkList {
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
    public Node findMid(Node head){
        // slow-fast approach
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){ // fast==null(even Node)and fast.next==null(odd Node)
            slow=slow.next; // 1+
            fast=fast.next.next;  // 2+
        }
        return slow;  // the slow is mid
    }
    public boolean checkPelindrom(){
        // base case
        if(head==null || head.next==null){
            return true;
        }
        // step-1->find the mid
        Node midNode=findMid(head);

        // step-2->Array.reverse the 2nd half
        Node prev=null;
        Node curr=midNode;
        Node next;

        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        Node right=prev;// because curr is null then right head is prev
        Node left=head;

        // step-3->check left half and right half
        while(right!=null){ // then 2nd half me right ka data aage badhte-2 null ki taraf jayega
            if(left.data != right.data){
                return false;
            }
            left=left.next; // uper wala codition glt h tb left data or right data aage badhega
            right=right.next;
        }
        return true;
    }
    public static void main (String args[]){
        pelindromLinkList pp=new pelindromLinkList();
        pp.print();
        pp.addfirst(2);
        pp.print();
        pp.addfirst(1);
        pp.print();
        pp.addlast(2);
        pp.print();
        pp.addlast(1);
        pp.print();
        System.out.println(pp.checkPelindrom());
    }
}
