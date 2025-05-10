package BinaryTree;

import Queue.QueueAndDequeFramwork;

import java.util.Deque;
import java.util.LinkedList;
import java.util.SequencedCollection;

public class InOrderWithotRec {
    public static void main(String[] args) {
        Inorder bt=new Inorder();
        bt.root = new Node(1);
        bt.root.left = new Node(2);
        bt.root.right = new Node(3);
        bt.root.left.left = new Node(4);
        bt.root.left.right = new Node(5);
        bt.root.right.left = new Node(6);
        bt.root.right.right = new Node(7);
        bt.Inorder(bt.root);
    }
}
class Inorder{
    Node root;
    public void Inorder(Node root){
        if (root==null)return;
        Deque<Node>deque=new LinkedList<>();
        Node curr=root;
        while (curr != null || !deque.isEmpty()){
            while (curr!=null){
                deque.add(curr);
                curr=curr.left;
            }
            curr=deque.pollLast();
            System.out.print(curr.val+" ");
            curr=curr.right;
        }
    }
}
