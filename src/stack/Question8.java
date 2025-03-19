package stack;

import java.util.Stack;

public class Question8 {
    static int min;

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        min = Integer.MAX_VALUE;
        push(st, 10);
        push(st, 5);
        push(st, 8);
        push(st, 6);

        pop(st);

        System.out.println(getmin(st));
    }

    public static void push(Stack<Integer> st, int val) {
        if (st.size() == 0) {
            st.push(val);
            min = val;
        } else if (val >= min) {
            st.push(val);
        } else {
            st.push(val*2 - min);
            min = val;
        }
    }

    public static void pop(Stack<Integer> st) {
        if (st.size() == 0) {
            System.out.println("-1");
            return;
        } else if (st.peek() >= min) {
            st.pop();
        } else {
            min = min*2 - st.peek();
            st.pop();
        }
    }

    public static int getmin(Stack<Integer> st) {
        if (st.isEmpty()) {
            return -1;
        } else {
            return min;
        }
    }
}
