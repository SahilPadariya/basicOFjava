package BinaryTree;

public class Question1 {
    public static void main(String[] args) {
        Btree bt=new Btree();
        bt.Root=new Node1(1);
        bt.Root.left=new Node1(2);
        bt.Root.right=new Node1(3);
        bt.Root.left.left=new Node1(4);
        bt.Root.left.right=new Node1(5);
        bt.Root.right.left=new Node1(6);
        bt.Root.right.right=new Node1(7);
        bt.countNode(bt.Root);
        System.out.println(bt.ans);
    }
}
class Node1{
    Node1 left,right;
    int val;
    Node1(int val){
        this.val=val;
    }
}
class Btree{
    Node1 Root;
    int ans=0;
    public void countNode(Node1 Root){
        if (Root==null)return;
        countNode(Root.left);
        ans++;
        countNode(Root.right);
    }
}

