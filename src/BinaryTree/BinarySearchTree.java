package BinaryTree;

import javax.xml.stream.XMLInputFactory;

public class BinarySearchTree {
    public static void main(String[] args) {
        BST bst=new BST();
        bst.insert(10);
        bst.insert(20);
        bst.insert(9);
        bst.insert(8);
        bst.insert(25);
        bst.insert(15);
        bst.insert(2);

        bst.delete(26);
        bst.delete(15);
        System.out.println(bst.search(10));
        bst.print();
    }
}
class BST{
    Node root;
    public void insert(int val){
        root=insert(root,val);
    }
    private Node insert(Node root,int val){
        if (root==null){
            root=new Node(val);
            return root;
        } else if (val>root.val) {
            root.right=insert(root.right,val);
        }
        else{
            root.left=insert(root.left,val);
        }
        return root;
    }

    public void print() {
        Print(root);
    }
    public void Print(Node root){
        if (root==null){
            return;
        }
        Print(root.left);
        System.out.print(root.val+" ");
        Print(root.right);
    }
    public boolean search(int val){
        return search2(root,val);
    }

    private boolean search2(Node root, int val) {
        if (root==null)return false;
        if (val==root.val)return true;
        if (val<root.val){
            return search2(root.left,val);
        }
        return search2(root.right,val);
    }
    public Node delete(int val){
        Delete(root,val);
        return root;
    }

    private Node Delete(Node root, int val) {
        if (root==null)return root;
        if (val>root.val){
            root.right=Delete(root.right,val);
        } else if (val<root.val) {
            root.left=Delete(root.left,val);
        }
        else {
            if (root.left==null){
                return root.right;
            } else if (root.right==null) {
                return root.left;
            }
            root.val= minValue(root.right);
            root.right=Delete(root.right, root.val);
        }
        return root;
    }
    public int minValue(Node root){
        int min=root.val;
        while (root.left != null){
            min=root.left.val;
        }
        return min;
    }
}