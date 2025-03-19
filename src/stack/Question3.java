package stack;

import java.util.Stack;

public class Question3 {
    public static void main(String[] args) {
        String str="how are you";
        Stack<Character> stack=new Stack<>();
        for (int i=0;i<str.length();i++){
            stack.push(str.charAt(i));
            if (str.charAt(i)==' '){
                reverse(stack);
            }
            else if (i==str.length()-1){
                reverse(stack);
            }
        }
    }
    public static void reverse(Stack<Character> stack){

       while (!stack.isEmpty()) {
           if (stack.peek()==' '){
               stack.pop();
               continue;
           }
           System.out.print(stack.pop());
       }
        System.out.print(' ');
    }
}
