package stack;

import java.util.Stack;

public class Question5 {
    public static void main(String[] args) {
        String string="madam";
        Stack<Character> stack= new Stack<>();
        for (int i=0; i<string.length()/2 ; i++) {
            stack.push(string.charAt(string.length()-i-1));
            if (stack.peek()!=string.charAt(i)) {
                System.out.println("False");
                return;
            }
        }
        System.out.println("True");
    }
}
