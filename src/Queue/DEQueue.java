package Queue;

import java.lang.reflect.Array;
import java.util.Arrays;

public class DEQueue {
    static int arr[]=new int[10];
    static int rear=-1,front=0;
    public static void main(String[] args) {
        InFirst(10);
        InFirst(20);
        InFirst(30);
        InFirst(40);
        InFirst(50);

        InLast(60);
        InLast(70);
        InLast(80);
        InLast(90);
        InLast(100);


        DelFir();
        LastDEl();

        print();
    }

    public static void InFirst(int val){
        if (rear==-1){
            rear++;
            arr[rear]=val;
        }
        else if (rear==arr.length-1){
            System.out.println("arr is full");
            return;
        }
        else{
                for (int i=rear;i>=front;i--){
                    arr[i+1]=arr[i];
                }
                arr[front]=val;
                rear++;
        }
    }

    public static void DelFir() {
        if (rear == -1) {
            System.out.println("arr is empty");
            return;
        } else {
            for (int i = front; i < rear; i++) {
                arr[i] = arr[i + 1];
            }
        }
        rear--;
    }

    public static void InLast(int val){
    if (rear==arr.length-1){
        System.out.println("arr is full");
    }
    else{
        rear++;
        arr[rear]=val;
    }
}

    public static void LastDEl(){
        if (rear==-1){
            System.out.println("arr is empty");
            return;
        }else {
            rear--;
        }
    }
    public static void print(){
        for (int i=front;i<=rear;i++){
            System.out.println(arr[i]);
        }
    }
}
