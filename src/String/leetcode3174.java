package String;

import java.util.Stack;

public class leetcode3174 {
    public static void main(String[] args) {
        String s = "abc";
        StringBuilder ans = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
                stack.push(s.charAt(i));
            } else {
               stack.pop();
            }
        }
        while (!stack.isEmpty()) {
            ans.append(stack.pop());
        }
        System.out.println(ans.reverse());
    }
}
