package BinaryTrees;

public class ZIG_ZAG_LEVEL {
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
    public static int height(Node root){
        if(root==null) return 0;
        int lh=height(root.left);
        int rh=height(root.right);
        return Math.max(lh,rh)+1;
    }
    public static void nthLevel1(Node root,int n){
        if(root==null) return;
        if(n==1){
            System.out.print(root.data+" ");
        }
        nthLevel1(root.left,n-1);
        nthLevel1(root.right,n-1);
    }
    public static void nthLevel2(Node root,int n){
        if(root==null) return;
        if(n==1){
            System.out.print(root.data+" ");
        }
        nthLevel2(root.right,n-1);
        nthLevel2(root.left,n-1);
    }

    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);
        int level=height(root)+1;
        for(int i=1;i<=level;i++){
            if(i%2!=0) {
                nthLevel1(root, i);
            }else{
                nthLevel2(root,i);
            }
            System.out.println();
        }
    }
}
