package BinaryTree;

public class Question2 {
    public static void main(String[] args) {
        btree2 bt=new btree2();
        bt.Root=new Node2(1);
        bt.Root.left=new Node2(2);
        bt.Root.right=new Node2(3);
        bt.Root.left.left=new Node2(4);
        bt.Root.left.right=new Node2(5);
        bt.Root.right.left=new Node2(6);
        bt.Root.right.right=new Node2(7);
        bt.NthNode(bt.Root,0);
    }
}
class Node2{
    Node2 left,right;
    int val;
    Node2(int val){
        this.val=val;
    }
}
class btree2{
    Node2 Root;
    int count=0;
    public void NthNode(Node2 Root,int nth){
        boolean flag=false;
        if (Root==null) {
            return;
        }
        if (!flag && count==0 || count>nth){
            System.out.println("Not found");
            return;
        }
        NthNode(Root.left,nth);
        count++;
        if (nth==count){
            System.out.println(Root.val);
            flag=true;
            return;
        }
        NthNode(Root.right,nth);
    }
    boolean flag = false;
    public void FindElement(Node2 root,int val) {
        if (root==null){
            return;
        }
        if (root.val==val){
            flag=true;
            return;
        }
        FindElement(root.left,val);
        if (root.val==val){
            flag=true;
            return;
        }
        FindElement(root.right,val);
    }
    int max=0;
    public int maxheight(Node2 root,int num){
        if (root==null)return 0;
        maxheight(root.left,num+1);
        if (num>max){
            max=num;
        }
        maxheight(root.right,num+1);
        return max;
    }

}
