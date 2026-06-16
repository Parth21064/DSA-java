package BTree;

import Patterns.numPrmd;

// class Node{
//     int data;
//     Node left;
//     Node right;

//     Node(int data){
//         this.data=data;
//         this.left=null;
//         this.right=null;
//     }
// }
public class treverse {

    static void inTreverse(Node root){
        if (root==null) {
            return;
        }
        inTreverse(root.left);
        System.out.println(root.data);
        inTreverse(root.right);
    }

    static void postTreverse(Node root){
        if (root==null) {
            return;
        }
        postTreverse(root.left);
        postTreverse(root.right);
        System.out.println(root.data);
    }

    public static void main(String[] args) {
        implement tree1=new implement();
        int []nodes={1,2,3,-1,-1,5,-1,-1,6,-1,9,-1,-1};
        Node root=tree1.treeBuilder(nodes);

        implement.preTravers(root);
        System.out.println("-------------------");
        inTreverse(root);
        System.out.println("-------------------");

        postTreverse(root);
        

    }
}
