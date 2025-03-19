package stack;

import java.util.Stack;

public class Question7 {
    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();
        Stack<Integer> stack1=new Stack<>();

        push(stack,stack1,50);
        push(stack,stack1,80);
        push(stack,stack1,5);
        push(stack,stack1,8);

        pop(stack,stack1);
        pop(stack,stack1);

        System.out.println(getmin(stack1));

    }
    public static void push(Stack<Integer> stack,Stack<Integer> stack1,int val){
        if (stack.isEmpty()){
            stack.push(val);
            stack1.push(val);
        } else if (stack1.peek()<val) {
            stack.push(val);
            stack1.push(stack1.peek());
        }
        else{
            stack.push(val);
            stack1.push(val);
        }
    }
    public static void pop(Stack<Integer> stack,Stack<Integer> stack1){
        if (stack.isEmpty()){
            System.out.println("stack is underflow");
            return;
        } else{
            stack.pop();
            stack1.pop();
        }
    }
    public static int getmin(Stack<Integer> stack1){
        if (stack1.isEmpty()){
            return -1;
        }
        else {
            return stack1.peek();
        }
    }
}
