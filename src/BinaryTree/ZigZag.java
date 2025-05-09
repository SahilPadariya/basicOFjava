package BinaryTree;
import java.util.*;
public class ZigZag {
    public static void main(String[] args) {
        zigzig z = new zigzig();
        z.root = new Node(1);
        z.root.left = new Node(2);
        z.root.right = new Node(3);
        z.root.left.left = new Node(4);
        z.root.left.right = new Node(5);
        z.root.right.left = new Node(6);
        z.root.right.right = new Node(7);
        System.out.println(z.zigzagLevelOrder(z.root));
    }
}
class zigzig {
    Node root;

    public List<List<Integer>> zigzagLevelOrder(Node root) {
        List<List<Integer>> result = new LinkedList<>();
        if (root == null) {
            return result;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        int level = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> levelsublist = new LinkedList<>();
            while (size > 0) {
                Node node = queue.poll();
                if (level % 2 != 0) {
                    levelsublist.addFirst(node.val);
                } else {
                    levelsublist.add(node.val);
                }
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
                size--;
            }
            level++;
            result.add(levelsublist);
        }
        return result;
    }
}
