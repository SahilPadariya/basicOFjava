package BinaryTree;

import java.util.Deque;
import java.util.LinkedList;

public class PostOrderWithouRec {
    public static void main(String[] args) {
        PostWithourRec bt=new PostWithourRec();
        bt.root = new Node(1);
        bt.root.left = new Node(2);
        bt.root.right = new Node(3);
        bt.root.left.left = new Node(4);
        bt.root.left.right = new Node(5);
        bt.root.right.left = new Node(6);
        bt.root.right.right = new Node(7);
        bt.PrintPostWithouRec(bt.root);
    }
}
class PostWithourRec{
    Node root;
    public void PrintPostWithouRec(Node Root){
        if (root==null)return;
        Deque<Node>deque=new LinkedList<>();
        Deque<Node>deque1=new LinkedList<>();
        deque.add(root);
        while (!deque.isEmpty()) {
            Node node = deque.pollLast();
            deque1.addFirst(node);
            if (node.left != null) deque.add(node.left);
            if (node.right != null) deque.add(node.right);
        }
        while (!deque1.isEmpty()){
            Node node=deque1.poll();
            System.out.print(node.val+" ");
        }
    }
}
