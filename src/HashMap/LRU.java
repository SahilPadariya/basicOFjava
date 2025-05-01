package HashMap;

import java.util.HashMap;
import java.util.Map;

public class LRU {
    public static void main(String[] args) {
        LRUCache lruCache=new LRUCache(0);

        lruCache.put(1,1);
//        lruCache.put(2,2);
//        lruCache.put(3,3);
//        lruCache.put(4,4);

        System.out.println(lruCache.get(1));

        lruCache.put(5,5);
        System.out.println(lruCache.get(3));

        lruCache.print();
    }
}
class Node {
    int key, value;
    Node next, prev;

    Node(int key, int value) {
        this.key = key;
        this.value = value;
    }
}

class LRUCache {
    int cap;
    Map<Integer, Node> map;
    Node head, tail;

    public LRUCache(int capacity) {
        this.cap = capacity;
        this.map = new HashMap<>();
        head = new Node(0, 0);
        tail = new Node(0, 0);

        head.next = tail;
        tail.prev = head;
    }

    public int get(int key) {
        if (map.containsKey(key)) {
            Node node = map.get(key);
            remove(node);
            return node.value;
        }
        return -1;
    }

    public void put(int key, int value) {
        if(cap==0){
            System.out.println("You cant add value");
            return;
        }
        if (map.containsKey(key)) {
            Node node = map.get(key);
            remove(node);
            node.value = value;
            return;
        }
        if (map.size() == cap) {
            Node node = tail.prev;

            map.remove(node.key);
            node.prev.next = tail;
            tail.prev = node.prev;

            node.next = null;
            node.prev = null;
        }
        InsertFirst(key, value);
    }

    public void remove(Node node) {
        Node Previos = node.prev;
        Node Nextele = node.next;

        Previos.next = Nextele;
        Nextele.prev = Previos;

        node.next = null;
        node.prev = null;

        node.next = head.next;
        head.next.prev = node;

        head.next = node;
        node.prev = head;
    }

    public void InsertFirst(int key, int value) {
        Node node = new Node(key, value);
        node.next = head.next;
        head.next.prev = node;

        head.next = node;
        node.prev = head;

        map.put(key, node);
    }
     public void print(){
         Node temp=head.next;
         if (temp==tail){
             System.out.println("Add pairs");
             return;
         }
         while (temp!=tail){
             System.out.println(temp.key+"="+temp.value);
             temp=temp.next;
         }
     }
}
