package com.company.LinkedList;

import java.io.*;
import java.util.*;

public class Solution {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            next=null;
        }
    }
    static Node head;

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        Node temp=head;
        for(int i=0;i<n;i++){
            int data1=sc.nextInt();
            //System.out.println(data1);

            Node newnode= new Node(data1);
            if(head==null) {
                head = newnode;
                temp = newnode;
                //System.out.println(temp.data);
            }
            else {
                temp.next = newnode;
                //System.out.println(temp.data);
                temp = temp.next;
            }
        }
        Node temp1=head;
        while(temp1!=null){
            System.out.println(temp1.data);
            temp1=temp1.next;
        }
    }
}