package stack;

import java.util.Arrays;

public class PushPopAllPractice {
    public static void main(String[] args) {
        int index=-1;
        int stack[]=new int[5];
        index=push(index,stack,5);
        index=push(index,stack,10);
        index=push(index,stack,15);
        index=push(index,stack,20);
        index=push(index,stack,25);
        index=pop(index);
        index=pop(index);
        index=pop(index);
        index=pop(index);
        index=pop(index);
        System.out.println(isEmpty(index));
        System.out.println(Arrays.toString(stack));
        System.out.println(peek(stack,index));
        System.out.println(size(index));

    }
    public static int push(int index,int stack[],int value){
        if (index==stack.length-1){
            System.out.println("stack is full");
            return index;
        }
        index++;
        stack[index]=value;
        return index;
    }
    public static int pop(int index){
        if (index==-1){
            System.out.println("stack is Empty");
            return index;
        }
        index--;
        return index;
    }
    public static boolean isEmpty(int index){
        if (index==-1){
            return true;
        }
        return false;
    }
    public static int peek(int []stack,int index){
        if (index==-1){
            return 0;
        }
        return stack[index];
    }
    public static int size(int index){
        return index+1;
    }
}
