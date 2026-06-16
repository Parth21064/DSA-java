package BTree;

import Patterns.numPrmd;

class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }
}



public class implement {
    int idx=-1;
    public Node treeBuilder(int []nodes){
        idx++;
        if (nodes[idx]==-1) {
            return null;
        }
        Node newNode=new Node(nodes[idx]);
        newNode.left=treeBuilder(nodes);
        newNode.right=treeBuilder(nodes);

        return newNode;
    }

    public static void preTravers(Node root){
        if (root==null) {
            // System.out.println(-1);
             return;
            
        }
        System.out.println(root.data+" ");
        preTravers(root.left);
        preTravers(root.right);
    }

    public static void main(String[] args) {
        int []nodes={1,2,3,-1,-1,5,-1,-1,6,-1,9,-1,-1};
        implement tree=new implement();

        Node root=tree.treeBuilder(nodes);

        preTravers(root);
    }

}
