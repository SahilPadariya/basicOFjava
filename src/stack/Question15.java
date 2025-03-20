package stack;

import java.util.Arrays;

public class Question15 {
    static int arr[]=new int[10];
    static int p=-1;
    static int p1= arr.length;
    public static void main(String[] args) {

        push1(10);
        push1(20);
        push1(30);
        push1(40);
        push1(50);

        push2(160);
        push2(170);
        push2(180);
        push2(200);
        push2(210);

        pop1();
        peek1();
        peek2();

        System.out.println(Arrays.toString(arr));

    }
    public static void push1(int val){
        if (p+1==p1){
            System.out.println("stack is overflow");
            return;
        }
        p++;
        arr[p]=val;
    }
    public static void push2(int val){
        if (p1-1==p){
            System.out.println("stack is overflow");
            return;
        }
        p1--;
        arr[p1]=val;
    }
    public static void pop1(){
        if (p==-1){
            System.out.println("stack is underflow");
            return;
        }
        arr[p]=0;
        p--;
    }
    public static void pop2(){
        if (p1== arr.length){
            System.out.println("stack is underflow");
            return;
        }
        arr[p1]=0;
        p1++;
    }
    public static void peek1(){
        if (p==-1){
            System.out.println("stack is underflow");
            return;
        }
        System.out.println(arr[p]);
    }
    public static void peek2(){
        if (p1== arr.length){
            System.out.println("stack is overflow");
            return;
        }
        System.out.println(arr[p1]);
    }
}
