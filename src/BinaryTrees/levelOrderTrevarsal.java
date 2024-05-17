package BinaryTrees;
import java.util.*;
public class levelOrderTrevarsal {
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
    public static void levelOrder(Node root){    // iterative ways
        Queue<Node>q=new LinkedList<>();
        if(root==null) return;
        q.add(root);
        while(!q.isEmpty()){
            Node temp=q.remove();
            System.out.print(temp.data+" ");
            if(temp.left!=null) q.add(temp.left);
            if(temp.right!=null) q.add(temp.right);
        }
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        levelOrder(root);

    }
}
