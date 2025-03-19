package stack;

import java.util.Stack;

public class Question2 {
    public static void main(String[] args) {
        String str = "Hello world";
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }
        reverse(stack);
    }
    public static void reverse(Stack<Character> stack){
        while (!stack.isEmpty()){
            System.out.print(stack.pop());
        }
    }
}
