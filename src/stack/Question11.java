package stack;

import java.util.Stack;

public class Question11 {
    public static void main(String[] args) {
        String s="96321+/*-";
        Stack<String>stack=new Stack<>();
        for (int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if (ch>='0' && ch<='9' || ch>='a' && ch<='z' || ch>='A' && ch<='Z'){
                stack.push(ch+"");
            }
            else {
                String s1=stack.pop();
                String s2=stack.pop();
                stack.push('('+s2+ch+s1+')');
            }
        }
        System.out.println(stack.peek());
    }
}
