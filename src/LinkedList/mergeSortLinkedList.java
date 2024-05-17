package LinkedList;

public class mergeSortLinkedList {
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
    public Node getMid(Node head){
        Node slow=head;
        Node fast=head.next;
        if(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;// mid
    }
    public Node merge(Node head1,Node head2){
        Node mergedll=new Node(-1);
        Node temp=mergedll;

        while(head1!=null && head2!=null){
            if(head1.data<=head2.data){
                temp.next=head1;
                head1=head1.next;
                temp=temp.next;
            }else{
                temp.next=head2;
                head2=head2.next;
                temp=temp.next;
            }
        }
        while(head1!=null){
            temp.next=head1;
            head1=head1.next;
            temp=temp.next;
        }
        while(head2!=null){
            temp.next=head2;
            head2=head2.next;
            temp=temp.next;
        }
         return mergedll.next;
    }
    public Node mergeSort(Node head){
        if(head==null || head.next==null){
            return head;
        }
        // find Mid
        Node mid=getMid(head);
        // left & right Sorting.mergeSort
        Node rightHead=mid.next;
        mid.next=null;
        Node newLeft=mergeSort(head);
        Node newRight=mergeSort(rightHead);
        // merge
        return merge(newLeft,newRight);
    }
    public static void main(String args[]){
        mergeSortLinkedList mm=new mergeSortLinkedList();
        mm.addfirst(1);
        mm.addfirst(2);
        mm.addfirst(3);
        mm.addfirst(4);
        mm.addfirst(5);
        mm.print();
        mm.head=mm.mergeSort(mm.head);
        mm.print();
    }
}
