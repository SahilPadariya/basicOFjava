package stack;

import java.util.Stack;

public class Question4 {
    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();

        //push

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        System.out.println(stack);

        //pop

        stack.pop();
        stack.pop();
        stack.pop();
        System.out.println(stack);

        //isEmpty

        System.out.println(stack.isEmpty());

        //peek

        System.out.println(stack.peek());

        //add any index

        stack.add(0,20);
        System.out.println(stack);

        //size

        System.out.println(stack.size());

        //search

        System.out.println(stack.search(30));

    }
}
