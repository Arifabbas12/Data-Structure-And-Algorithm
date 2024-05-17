package BinaryTrees;

public class KthAncecstor {
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
    public static int kthAncestor(Node root,int n,int k){
        if(root==null) return -1;
        if(root.data==n) return 0;
        int leftDist=kthAncestor(root.left,n,k);
        int rightDist=kthAncestor(root.right,n,k);
        if(leftDist==-1 && rightDist==-1) return -1;
        int maxDist=Math.max(leftDist,rightDist)+1;
        if(maxDist+1==k){
            System.out.print(root.data+" ");
        }
        return maxDist+1;
    }

    public static void main(String[] args) {
        /*
                     1
                    / \
                   2   3
                  / \  / \
                 4   5 6  7
         */

        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);
        int n=5,k=2;
        kthAncestor(root,n,k);
    }
}
