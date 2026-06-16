package StackDSA;

import java.util.ArrayList;

import Patterns.numPrmd;

class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}

public class implyLinkList {
    Node head;
    boolean isEmpty(){
        return head==null;
    }
    void push(int data){
        Node temp=new Node(data);
        if (isEmpty()) {
            head=temp;
            return;
        }
        
        temp.next=head;
        head=temp;

    }

    int pop(){
        if (isEmpty()) {
            return -1;
        }
        int top=head.data;
        head=head.next;
        return top;
    }
    int peek(){
        if(isEmpty())
            return -1;
        return head.data;

    }

    void pushAtBottom(int data){
        Node temp=new Node(data);
        if (isEmpty()) {
            head=temp;
            return;
        }
        Node tail=head;
        while (tail.next!=null) {
            tail=tail.next;
        }
        tail.next=temp;
    }

    void reveseStack(){
        Node current=head;
        Node previousNode=null;
        Node nextNode;
        while (current!=null) {
            nextNode=current.next;
            current.next=previousNode;

            previousNode=current;
            current=nextNode;
        }
        head=previousNode;
    }

    public static void main(String[] args) {
        implyLinkList st=new implyLinkList();

        ArrayList<Integer> list =new ArrayList<>();

        st.push(0);
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);

        System.out.println("Peek: "+st.peek());

        // System.out.println("Popped element: "+st.pop());
        // System.out.println("Popped element: "+st.pop());
        st.pushAtBottom(69);
        st.reveseStack();
        System.out.println("Peek: "+st.peek());
    }
}
