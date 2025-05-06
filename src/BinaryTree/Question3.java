package BinaryTree;

public class Question3 {
    public static void main(String[] args) {
        btree2 bt=new btree2();
        bt.Root=new Node2(1);
        bt.Root.left=new Node2(2);
        bt.Root.right=new Node2(3);
        bt.Root.left.left=new Node2(4);
        bt.Root.left.right=new Node2(5);
        bt.Root.right.left=new Node2(6);
        bt.Root.right.right=new Node2(7);
        bt.FindElement(bt.Root,1);
        if (bt.flag){
            System.out.println("Present");
        }else {
            System.out.println("Not Present");
        }
    }
}

