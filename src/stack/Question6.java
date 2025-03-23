package stack;

import java.util.Stack;

public class Question6 {
    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();
        Stack<Integer> stack1=new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.push(60);
        stack.push(70);
        stack.push(80);
        stack.push(90);
        stack.push(100);
        delete(stack,stack1);
        System.out.println(stack);

    }
    public static void delete(Stack<Integer> stack,Stack<Integer> stack1){
        int mid=stack.size()/2;
        for (int i=0;i<mid;i++){
            stack1.push(stack.pop());
        }
        stack.pop();
        while (!stack1.isEmpty()){
            stack.push(stack1.pop());
        }
    }
}
