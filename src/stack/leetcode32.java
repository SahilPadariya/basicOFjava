package stack;

import java.util.Stack;

public class leetcode32 {
    public static void main(String[] args) {
        String s = ")()())";
        int c = 0;
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(') {
                stack.push(i);
            } else {
                stack.pop();
                if (stack.isEmpty()){
                    stack.push(i);
                }
                else {
                    c=Math.max(c,i-stack.peek());
                }
            }
        }
        System.out.println(c);
    }
}

