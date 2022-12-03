package com.company.BinearyTree;

class Node{
    Node left;
    Node right;
    int data;
}
class NodeTree {

    public Node createNewNode(int val) {
        Node newNode = new Node();
        newNode.data = val;
        newNode.left = null;
        newNode.right = null;
        return newNode;
    }
    public void inorder(Node node) {
        if(node == null) {
            return;
        }

        inorder(node.left);
        System.out.print(node.data + " ");
        inorder(node.right);
    }

    public void preorder(Node node) {
        if(node == null) {
            return;
        }

        System.out.print(node.data + " ");
        preorder(node.left);
        preorder(node.right);
    }

    public void postorder(Node node) {
        if(node == null) {
            return;
        }

        postorder(node.left);
        postorder(node.right);
        System.out.print(node.data + " ");
    }
    public  int getSumAllNode(Node root){
        if(root==null){
            return 0;
        }
        return root.data +getSumAllNode(root.left)+getSumAllNode(root.right);
    }
}
public class BinearyTree {
    public static void main(String[] args) {
        NodeTree a= new NodeTree();
        Node root = a.createNewNode(2);
        root.left = a.createNewNode(7);
        root.right = a.createNewNode(5);
        root.left.left = a.createNewNode(2);
        root.left.right = a.createNewNode(6);
        root.left.right.left = a.createNewNode(5);
        root.left.right.right = a.createNewNode(11);
        root.right.right = a.createNewNode(9);
        root.right.right.left = a.createNewNode(4);


        System.out.print("Inorder: ");
        a.inorder(root);
        System.out.println();


        System.out.print("PreOrder: ");
        a.preorder(root);
        System.out.println();

        System.out.print("PostOrder: ");
        a.postorder(root);
        System.out.println();

        System.out.println("sum of all the nodes in BT:"+ a.getSumAllNode(root));
    }
}
