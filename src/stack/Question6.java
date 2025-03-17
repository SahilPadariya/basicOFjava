package stack;

import java.util.Stack;

public class Question6 {
    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.push(60);
        stack.push(70);
        stack.push(80);
        stack.push(90);
        stack.push(100);

        delete(stack,stack.size(),0);
        System.out.println(stack);
    }
    public static void delete(Stack<Integer> stack,int size,int current){
        if (stack.isEmpty() || current==size/2){
            stack.pop();
            return;
        }
        int temp = stack.pop(); // jetli vaar if condition khoti padse tya sudhi no record sotre thase
        delete(stack, size, current + 1); // current ma add thatu jase jya sudhi mid na male
        stack.push(temp); // record thayeli aa ele pachi (LIFO) ma add thase
    }
}
