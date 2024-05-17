package LinkedList;

public class LinkedList {
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
    public static int size;

    public void addFirst(int data){
        // step-1-> to create a newNode
       Node newNode=new Node(data);
        size++;
        if(head==null){
           head=tail=newNode;
           return;
        }
        // step-2->newNode next=head
        newNode.next=head; //link
        // step-3->newNode=head
        head=newNode;
    }
    public void addLast(int data){
        // step-1-> to create a newNode
       Node newNode=new Node(data);
        size++;
        if(tail==null){
            head=tail=newNode;
            return;
        }
        // step-2-> tail.next=newNode
        tail.next=newNode;
        // step-3-> tail=newNode
        tail=newNode;
    }
    public void print(){
        if(head==null){
            System.out.println("ll is empty");
            return;
        }
        Node temp=head;
        while(temp != null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public void add(int idx,int data) {
        // create a newNode
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0; // for iterate

        while (i < idx - 1) {
            temp = temp.next;
            i++;
        }
        // i=idx-1 then temp=prev
        newNode.next = temp.next;
        temp.next = newNode;

//    public int removeFirst(){
//        if(size==0){
//            System.out.println("ll is empty");
//            return Integer.MIN_VALUE;
//        }else if(size==1){
//            int val=head.data;
//            head=tail=null;
//            size=0;
//            return val;
//        }
//        int val=head.data;
//        head=head.next;
//        size--;
//        return val;
//    }
//    public int removeLast(){
//        if(size==0){
//            System.out.println("ll is empty");
//            return Integer.MIN_VALUE;
//        }else if(size==1){
//            int val=head.data;
//            head=tail=null;
//            size=0;
//            return val;
//        }
//        // prev:i=size-2
//        Node prev=head;
//        for(int i=0;i<size-2;i++){
//            prev=prev.next;
//        }
//        int val=prev.next.data; // tail.data
//        prev.next=null;
//        tail=prev;
//        size--;
//        return val;
//    }
//    public int itrSearch(int key){
//        Node temp=head;
//        int i=0;
//
//        while(temp!=null){
//            if(temp.data==key){
//                return i;
//            }
//            temp=temp.next;
//            i++;
//        }
//        return -1;
//    }
//    // Search using recursion
//    public int helper(Node head,int key){
//        if (head == null) {
//            return -1;
//        }
//        if(head.data==key){
//            return 0;
//        }
//        int idx=helper(head.next,key);
//        if(idx==-1){
//            return -1;
//        }
//        return idx+1;
//    }
//    public int recSearch(int key){
//        return helper(head,key);
//    }
//    // Array.reverse the linkedList
//    public void Array.reverse(){
//        Node prev=null;
//        Node curr=tail=head;
//        Node next;
//        while(curr!=null){
//            next=curr.next;
//            curr.next=prev;
//            prev=curr;
//            curr=next;
//        }
//        prev=head;
//    }
    }
    public void deleteNthfromEnd(int n){
        // calculate size
        int sz=0;
        Node temp=head;
        while(temp!=null){
            temp=temp.next;
            sz++;
        }
        if(n==sz){
            head=head.next; // remove practice.practice.first
            return;
        }
        // sz-n->Here,we will reached before the delete element
        int i=1;
        int iToFind=sz-n; // idx2find
        Node prev=head;
        while(i<iToFind){
            prev=prev.next;
            i++;
        }
        prev.next=prev.next.next;
        return;
    }
    public static void main(String args[]){
        LinkedList ll=new LinkedList();
        ll.print();
        ll.addFirst(2);
        ll.print();
        ll.addFirst(1);
        ll.print();
        ll.addLast(3);
        ll.print();
        ll.addLast(4);
        ll.print();
        ll.add(2,9);
        ll.print();
//        ll.removeFirst();
//        ll.print();
//        ll.removeLast();
//        ll.print();
//        System.out.println(ll.size);
//        System.out.println(ll.itrSearch(3));
//        System.out.println(ll.recSearch(9));
//        ll.Array.reverse();
//        ll.print();
        ll.deleteNthfromEnd(3);
        ll.print();

    }
}
