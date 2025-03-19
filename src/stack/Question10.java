package stack;

import java.util.Stack;

public class Question10 {
    public static void main(String[] args) {
        String s="-9/*+5346";
        Stack<String> stack=new Stack<>();
        for (int i=s.length()-1;i>=0;i--){
            char ch=s.charAt(i);
            if (ch>='0' && ch<='9' || ch<='a' && ch>='z' || ch<='A' && ch>='Z'){
                stack.push(ch+"");
            }
            else {
                String s1=stack.pop();
                String s2=stack.pop();
                stack.push('('+s1+ch+s2+')');
            }
        }
        System.out.println(stack.peek());
    }
}
