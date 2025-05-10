package BinaryTree;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

//print preorder withaout recursion

public class PreOrderWithoutRec {
    public static void main(String[] args) {
        Bt2 bt=new Bt2();
        bt.root = new Node(1);
        bt.root.left = new Node(2);
        bt.root.right = new Node(3);
        bt.root.left.left = new Node(4);
        bt.root.left.right = new Node(5);
        bt.root.right.left = new Node(6);
        bt.root.right.right = new Node(7);
        bt.PrintPre(bt.root);
    }
}
class Bt2{
    Node root;
    public void PrintPre(Node root){
        if(root==null) return;
        Deque<Node>queue=new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            Node node = queue.pollLast();
            System.out.print(node.val+" ");
            if (node.right != null) {
                queue.add(node.right);
            }
            if (node.left != null){
                queue.add(node.left);
            }
        }
    }
}
