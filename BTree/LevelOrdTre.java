package BTree;

import java.util.*;

import Patterns.numPrmd;

public class LevelOrdTre {

    public static void trev(Node root){

        if (root==null) {
            return;
        }

        Queue<Node> nodes=new LinkedList<>();

        nodes.add(root);
        nodes.add(null);

        while (!nodes.isEmpty()) {
            Node currNode=nodes.remove();
            if (currNode==null) {
                System.out.println();
                if (nodes.isEmpty()) {
                    break;
                }
                else{
                    nodes.add(null);
                }
            }
            else{

                System.out.print(currNode.data);

                if (currNode.left!=null) {
                    nodes.add(currNode.left);
                }

                if (currNode.right!=null) {
                    nodes.add(currNode.right);
                }
            }
        }

        
            

    }

    public static int countNode(Node root){
            if (root==null) {
                return 0;
            }
            int left= countNode(root.left);
            int right=countNode(root.right);
            return left+right+1;
    }



    public static int  sumNodes(Node root){
        if (root==null) {
            return 0;
        }
        return root.data+sumNodes(root.right)+sumNodes(root.left);
    }

    public static int height(Node root){
        if (root==null) {
            return 0;
        }
        return 1+Math.max(height(root.left), height(root.right));
    }
    public static void main(String[] args) {

        implement tree=new implement();
        int []arr={1,2,3,-1,-1,5,-1,-1,6,-1,9,-1,-1};
        Node root=tree.treeBuilder(arr);

        // trev(root);

        int count=countNode(root);
        System.out.println(count);
        int sum=sumNodes(root);
        System.out.println(sum);
        System.out.println(height(root));


    }
}
