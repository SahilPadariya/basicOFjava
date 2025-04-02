package Queue;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;


public class ImplementStack {

    static Queue<Integer> queue1=new LinkedList<>();
    static Queue<Integer> queue2=new LinkedList<>();

    public static void main(String[] args) {

        InsertHavy(10);
        InsertHavy(20);
        InsertHavy(30);
        InsertHavy(40);

        DeleteLoos();
        DeleteLoos();
        DeleteLoos();
        DeleteLoos();

        InsertHavy(50);
        System.out.println(queue1);
    }
    public static void InsertLoos(int val){
        queue1.add(val);
    }
    public static void DeleteHavy(){
        if(queue1.size()==0){
            System.out.println("Stack is Empty");
            return;
        }
        while (queue1.size()!=1){
            queue2.add(queue1.poll());
        }
        queue1.poll();
        while (queue2.size()!=0){
            queue1.add(queue2.poll());
        }
    }
    public static void InsertHavy(int val){
        if (queue1.size()==0){
            queue1.add(val);
        }
        else {
            while (!queue1.isEmpty()){
                queue2.add(queue1.poll());
            }
            queue1.add(val);
            while (!queue2.isEmpty()){
                queue1.add(queue2.poll());
            }
        }
    }
    public static void DeleteLoos(){
        if (queue1.size()==0){
            System.out.println("Stack is Empty");
            return;
        }
        queue1.poll();
    }
}
