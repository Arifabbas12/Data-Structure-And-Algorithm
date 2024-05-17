package BinaryTrees;

public class DiameterOfNode {
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

    // Approach-1
    public static int height(Node root){
        if(root==null) return 0;
        int lh=height(root.left);
        int rh=height(root.right);
        return Math.max(lh,rh)+1;
    }
    public static int diameter1(Node root){
       if(root==null) return 0;
       int leftDiameter=diameter1(root.left);
       int leftHeight=height(root.left);
       int rightDiameter=diameter1(root.right);
       int rightHeight=height(root.right);

       int selfDiameter=leftHeight+rightHeight+1;
       return Math.max(selfDiameter,Math.max(leftDiameter,rightDiameter));
    }
    static class Info{
        int diameter;
        int ht;
       Info left;
       Info right;

        public Info(int diameter,int ht){
            this.diameter=diameter;
            this.ht=ht;
            this.left=null;
            this.right=null;
        }
    }
    public static Info diameter(Node root){
        if(root==null){
            return new Info(0,0);
        }
        Info leftInfo=diameter(root.left);
        Info rightInfo=diameter(root.right);
        int diameter=Math.max(leftInfo.ht+rightInfo.ht+1,Math.max(leftInfo.diameter,rightInfo.diameter));
        int ht=Math.max(leftInfo.ht,rightInfo.ht)+1;
        return new Info(diameter,ht);
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
        System.out.println(diameter(root).diameter);
        System.out.println(diameter(root).ht); // height of the tree
        System.out.println(diameter1(root));
    }
}
