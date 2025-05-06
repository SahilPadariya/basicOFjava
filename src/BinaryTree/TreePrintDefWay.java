package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class TreePrintDefWay {
    public static void main(String[] args) {
        BT bt=new BT();
        bt.Root=new Node(1);
        bt.Root.left=new Node(2);
        bt.Root.right=new Node(3);
        bt.Root.left.left=new Node(4);
        bt.Root.left.right=new Node(5);
        bt.Root.right.left=new Node(6);
        bt.Root.right.right=new Node(7  );
//        bt.LevelOrder();
//        bt.PreOrder(bt.Root);
//        bt.InOrder(bt.Root);
        bt.PostOrder(bt.Root);
    }
}
class Node{
    Node left,right;
    int val;
    Node(int val) {
        this.val = val;
    }
}
class BT{
    Node Root;

    public void LevelOrder(){
        Queue<Node>queue=new LinkedList<>();
        queue.add(Root);
        while (!queue.isEmpty()){
            Node node=queue.poll();
            System.out.println(node.val);
            if (node.left!= null){
                queue.add(node.left);
            }
            if (node.right!=null){
                queue.add(node.right);
            }
        }
    }
    public void PreOrder(Node root){
        if (root==null) return;
        System.out.println(root.val);
        PreOrder(root.left);
        PreOrder(root.right);
    }
    public void InOrder(Node root){
        if (root==null) return;
        InOrder(root.left);
        System.out.print(root.val+" ");
        InOrder(root.right);
    }
    public void PostOrder(Node root){
        if (root==null)return;
        PostOrder(root.left);
        PostOrder(root.right);
        System.out.println(root.val);
    }
}
