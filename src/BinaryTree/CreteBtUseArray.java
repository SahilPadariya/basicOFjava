package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class CreteBtUseArray {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9};
        BinaryTree binaryTree=new BinaryTree();
        Node root=binaryTree.CreteBT(arr);
        binaryTree.print(root);
    }
}
class BinaryTree {

    public Node CreteBT(int[] arr) {
        if (arr.length == 0) {
            return null;
        }
        Queue<Node> queue = new LinkedList<>();
        Node root = new Node(arr[0]);
        queue.add(root);
        int index = 1;
        while (!queue.isEmpty() && index < arr.length) {
            Node node = queue.poll();
            if (index < arr.length) {
                node.left = new Node(arr[index]);
                queue.add(node.left);
            }
            index++;
            if (index < arr.length) {
                node.right = new Node(arr[index]);
                queue.add(node.right);
            }
            index++;
        }
        return root;
    }

    public void print(Node root) {
        if (root == null) {
            return;
        }
        System.out.println(root.val);
        print(root.left);
        print(root.right);
    }
}

