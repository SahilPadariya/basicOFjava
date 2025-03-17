package stack;

import java.util.Stack;

public class Question5 {
    public static void main(String[] args) {
        String string="eye";
        Stack<Character> stack= new Stack<>();
        for (int i=0; i<string.length(); i++) {
            stack.push(string.charAt(i));
        }
        for (int i=0; i<string.length(); i++){
            if (stack.pop() != string.charAt(i)){
                System.out.println("False");
                return;
            }
        }
        System.out.println("True");
    }
}
