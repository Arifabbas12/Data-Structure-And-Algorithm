package BinaryTrees;

public class DisplayTree {
    static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    public static void display(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data+"->");
       if(root.left!=null){
           System.out.print(root.left.data+" ");
       }
       if(root.right!=null){
           System.out.print(root.right.data+" ");
       }
        System.out.println();
       display(root.left);
       display(root.right);
    }

    public static void main(String[] args) {
        Node root=new Node(2);
        root.left=new Node(4);
        root.right=new Node(6);
        root.left.left=new Node(10);
        root.left.right=new Node(12);
        root.right.left=new Node(21);
        root.right.right=new Node(34);
        display(root);
    }
}
