package stack;

import java.util.Stack;

public class Question3 {
    public static void main(String[] args) {
        String str="how are you";
        int index=0;
        for (int i=0;i<str.length();i++){
            if (str.charAt(i)==' '){
                reverse(str,i-1,index);
                index=i+1;
            }
            else if (i==str.length()-1){
                reverse(str,i,index);
                index=i+1;
            }
        }
    }
    public static void reverse(String str,int i,int index){
        Stack<Character> stack=new Stack<>();
        if (stack.isEmpty()){
            stack.push(' ');
        }
       for (int j=index;j<=i;j++) {
           stack.push(str.charAt(j));
       }
       while (!stack.isEmpty()) {
           System.out.print(stack.pop());
       }
    }
}
