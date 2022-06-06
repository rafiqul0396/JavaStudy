package com.company.LinkedList;

class Node{
    int data;
    Node next;
}
class Linked{

    public Node insert(int i, Node root) {
        if(root==null){
            return getNode(i);
            
        }
        else {
            root.next = insert(i, root.next);
        }
        return root;
    }

    private Node getNode(int i) {
        Node a=new Node();
        a.data=i;
        a.next =null;
        return a;
    }
}



public class LinKedList {
    public static void main(String[] args) {
        Node root=null;
        Linked a=new Linked();
        a.insert(12,root);
        a.insert(99,root);
        a.insert(20,root);

    }
}
