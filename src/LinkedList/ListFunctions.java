package LinkedList;

import java.util.Stack;

public class ListFunctions {
    public static void main(String[] args) {
        LinkedList linkedList=new LinkedList();
        linkedList.insert(10);
        linkedList.insert(20);
        linkedList.insert(30);

        linkedList.insert(40);
        linkedList.insert(50);
        linkedList.insert(60);
        linkedList.insert(70);
        linkedList.insert(80);

        linkedList.delet(50);

        linkedList.print();

    }
}
class node{
    int data;
    node next;
    public node(int data) {
        this.data = data;
    }
}
class LinkedList {
    node head, tail;

    void insert(int data) {
        node nn = new node(data);
        if (head == null) {
            head = tail = nn;
        } else {
            tail.next = nn;
            tail = nn;
        }
    }

    //print linkedlist
    void print() {
        node temp = head;
        if (temp == null) {
            System.out.println("LinkedList is Empty");
            return;
        } else {
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }
    }

    //find elelment in linked list
    void find(int data) {
        node temp = head;
        if (temp == null) {
            System.out.println("LinkedList is Empty");
            return;
        } else {
            while (temp != null) {
                if (temp.data == data) {
                    System.out.println("Present");
                    return;
                }
                temp = temp.next;
            }
            System.out.println("Not Present");
        }
    }

    //print revers linked list using stack
    void PrintRev() {
        node temp = head;
        Stack<Integer> stack = new Stack<>();
        if (temp == null) {
            System.out.println("LinkedList Is Empty");
            return;
        } else {
            while (temp != null) {
                stack.push(temp.data);
                temp = temp.next;
            }
        }
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
    }

    //delete element in linkedlist
    void delet(int data) {
//        boolean flag = false;
//        if (head == null) {
//            System.out.println("LinkedList Is Empty");
//            return;
//        }
//        if (head.next == null && head.data == data) {
//            flag = true;
//            head = tail = null;
//        } else {
//            if (head.data == data && head.next.data != data) {
//                flag = true;
//                node temp = head;
//                head = head.next;
//                temp.next = null;
//            } else {
//                node temp=head;
//                node prev=null;
//                while (temp.data == data && temp.next.data == data){
//                    temp=temp.next;
//                }
//                if (temp == tail){
//                    head=tail=null;
//                }
//                else {
//                    head=temp.next;
//                }
//            }
//        }
//        node temp = head;
//        while (temp.next != null) {
//            if (temp.next.data == data) {
//                if (temp.next == tail) {
//                    flag = true;
//                    temp.next = null;
//                    tail = temp;
//                } else {
//                    flag = true;
//                    temp.next = null;
//                    temp.next = temp.next.next;
//                }
//            } else {
//                temp = temp.next;
//            }
//        }
//        if (flag == false) {
//            System.out.println("Not Found");
//            return;
//        }
        boolean flag =false;
            if (head == null) {
                System.out.println("LinkedList is Empty");
                return;
            }
            node t;
            node temp2;
            while (head != null && head.data == data) {
                flag=true;
                temp2=head.next;
                head.next=null;
                head=temp2;
            }

            if (head == null) {
                tail = null;
                return;
            }

            node temp = head;
            while (temp.next != null) {
                if (temp.next.data == data) {
                    flag=true;
                    if (temp.next==tail){
                        tail=temp;
                        temp.next=null;
                    }
                    else {
                        node swap=temp.next.next;
                        temp.next.next=null;
                        temp.next=swap;
                    }
                } else {
                    temp = temp.next;
                }
            }

            tail = temp;
            if (flag==false){
                System.out.println("Not Found");
                return;
            }
        }
}
