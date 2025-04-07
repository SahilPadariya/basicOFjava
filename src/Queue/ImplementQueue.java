package Queue;

import java.util.Stack;

public class ImplementQueue {

    static Stack<Integer> stack1=new Stack<>();
    static Stack<Integer> stack2=new Stack<>();

    public static void main(String[] args) {
        pusheasy(10);
        pusheasy(20);
        pusheasy(30);
        pusheasy(40);
        pusheasy(50);

        pophavy();
        System.out.println(stack1);
//        pushHavy(10);
//        pushHavy(20);
//        pushHavy(30);
//        pushHavy(40);
//        pushHavy(50);

//        popeasy();
//        printOnlyDelHavy();
    }
    public static void pusheasy(int val){
        stack1.push(val);
    }
    public static void pophavy(){
        if (stack1.size()==0){
            System.out.println("Queue is empty");
            return;
        }else {
            while (stack1.size()!=1){
                stack2.push(stack1.pop());
            }
            stack1.pop();
            while (!stack2.isEmpty()){
                stack1.push(stack2.pop());
            }
        }
    }
    public static void pushHavy(int val){
        if(stack1.isEmpty()){
            stack1.push(val);
        }
        else {
            while (!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
            stack1.push(val);
            while (!stack2.isEmpty()){
                stack1.push(stack2.pop());
            }
        }
    }
    public static void popeasy(){
        if (stack1.isEmpty()){
            System.out.println("Queue is Empty");
            return;
        }
        else{
            stack1.pop();
        }
    }
    public static void printOnlyDelHavy(){
        while (!stack1.isEmpty()){
            System.out.print(stack1.peek()+" ");
            stack2.push(stack1.pop());
        }
        while (!stack2.isEmpty()){
            stack1.push(stack2.pop());
        }
    }
}
