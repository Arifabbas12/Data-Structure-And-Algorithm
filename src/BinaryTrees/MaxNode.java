package BinaryTrees;

public class MaxNode {
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
    public static int max(Node root){
       if(root==null) return Integer.MIN_VALUE;
       int a=root.data;
       int b=max(root.left);
       int c=max(root.right);
       return Math.max(a,Math.max(b,c));
    }

    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(66);
        root.right.right=new Node(7);
        System.out.println(max(root));
    }
}
