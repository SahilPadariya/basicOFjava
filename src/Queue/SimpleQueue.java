package Queue;

import java.util.Arrays;

public class SimpleQueue {
    static int front = -1, rear = -1;
    static int arr[] = new int[5];

    public static void main(String[] args) {
        add(10);
        add(20);
        add(30);
        add(40);
        add(50);

        delete();
        delete();

        print();

    }

    public static void add(int val) {
        if (rear == arr.length-1) {
            System.out.println("arr is full");
            return;
        }
        else {
            rear++;
            arr[rear] = val;
        }
    }

    public static void delete() {
        if (front == -1 && rear == -1) {
            System.out.println("arr is empty");
            return;
        }
        else if (front == rear) {
            front = rear = -1;
        }
        front++;
    }

    public static void print() {
        if (rear==-1) {
            System.out.println("arr is Empty");
            return;
        }
        for (int i = front+1; i <= rear; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}