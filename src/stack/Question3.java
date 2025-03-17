package stack;

import java.util.Stack;

public class Question3 {
    public static void main(String[] args) {
        String str="how are you";
        Stack<Character> stack=new Stack<>();
        for (int i=0;i<str.length();i++){
            stack.push(str.charAt(i));
            if (str.charAt(i)==' ' || i==str.length()-1){
                reverse(i,stack);
            }
        }
        System.out.println(stack);
    }
    public static void reverse(int i, Stack<Character> stack){
        for (int j=i;j>=0;j--){
            System.out.println(stack.pop());
        }
    }
}
