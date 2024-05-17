package BinaryTrees;

import java.util.ArrayList;

public class  TreeTraversalUsingInorder {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    static class BinaryTree{
        static int idx=-1;
        public static Node buildTree(int nodes[]){
            idx++;
            if(nodes[idx]==-1){
                return null;
            }
            Node newNode=new Node(nodes[idx]);
            newNode.left=buildTree(nodes);
            newNode.right=buildTree(nodes);
            return newNode;
        }
        public static void Inorder(Node root,ArrayList<Integer>list){
            if(root==null){
                return;
            }
            Inorder(root.left,list);
            list.add(root.data);
            Inorder(root.right,list);

        }
    }

    public static void main(String[] args) {
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree=new BinaryTree();
        Node root=tree.buildTree(nodes);
        ArrayList<Integer>list=new ArrayList<>();
       tree.Inorder(root,list);
       int data=5;
       int idx=-1;
       for(int i=0;i<list.size();i++){
           if(list.get(i)==data){
               idx=i;
               break;
           }
       }
       int pred=list.get(idx-1);
       int succ=list.get(idx+1);
        System.out.println("pred is :"+pred);
        System.out.println("succ is :"+succ);
    }
}
