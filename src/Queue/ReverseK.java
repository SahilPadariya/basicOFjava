package Queue;

import java.util.*;

public class ReverseK {
    static Deque<Integer> deque=new LinkedList<>();
    static Queue<Integer> help=new LinkedList<>();

    static int k=3;
    public static void main(String[] args) {
        enque(3);
        enque(2);
        enque(1);
        enque(4);
        enque(5);

        reverse();
        System.out.println(deque);
    }

    public static void enque(int val){
        deque.add(val);
    }

    public static void reverse(){
        for (int i=0;i<k;i++){
           help.add(deque.poll());
        }
        for (int i=0;i<k;i++){
            deque.addFirst(help.poll());
        }
    }
}

