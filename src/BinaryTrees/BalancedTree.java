package BinaryTrees;

public class BalancedTree {
    static class Node{
        int data;
        Node right;
        Node left;

        public Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    public static int height(Node root){
        if(root==null){
            return 0;
        }
        return Math.max(height(root.left),height(root.right))+1;
    }
    public static boolean balanced(Node root){
        if(root==null) return true;
        int lh=height(root.left);
        int rh=height(root.right);
        int D=lh-rh;
        if(D<0) D=-1;
        if(D>1)  return false;
        return balanced(root.left) && balanced(root.right);
    }

    public static void main(String[] args) {
          /*
                     1
                    / \
                   2   3
                  / \  / \
                 4   5 6  7
                         / \
                        8   9
         */
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);
        root.right.right.left=new Node(8);
        root.right.right.right=new Node(9);
        System.out.println(balanced(root));

    }
}
