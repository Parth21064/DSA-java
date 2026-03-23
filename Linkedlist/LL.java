import Array.revArray;
import Patterns.numPrmd;

class Node{
    String data;
    Node next;

    Node(String data){
        this.data=data;
        this.next=null;
    }
}
public class LL {

     Node head;

    public void addF(String data){
        Node newNode=new Node(data);

        if(head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }

    public void addL(String data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        Node currNode;
        currNode=head;
        while (currNode.next!=null) {
            currNode=currNode.next;
        }
        currNode.next=newNode;
    }

    public static void main(String[] args) {
        System.out.println("Bidhan");
    }
}

