package LinkedList.Doubly;

public class CreateAllFunction {
    public static void main(String[] args) {
        DoublyLinkedList doublyLinkedList=new DoublyLinkedList();
        doublyLinkedList.insert(10);
        doublyLinkedList.insert(20);
        doublyLinkedList.insert(30);
        doublyLinkedList.insert(40);
        doublyLinkedList.insert(50);
        doublyLinkedList.insert(60);
        doublyLinkedList.insert(70);
        doublyLinkedList.insert(80);
        doublyLinkedList.insert(90);
        doublyLinkedList.insert(100);
        doublyLinkedList.insert(110);
        doublyLinkedList.insert(120);
        doublyLinkedList.insert(130);

        doublyLinkedList.delete(130);

        doublyLinkedList.print();
        System.out.println();
        doublyLinkedList.printrev();
    }
}
class node{
    node next,prev;
    int val;
    public node(int val) {
        this.val = val;
    }
}
class DoublyLinkedList{
    node head,tail;
    public void insert(int val){
        node nn=new node(val);
        if (head==null){
            head=tail=nn;
        }
        else{
            nn.prev=tail;
            tail.next=nn;
            tail=nn;
        }
    }

    public void print() {
        if (head==null) {
            System.out.println("dobly is empty");
            return;
        }
        node temp=head;
        while (temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
    }

    public void printrev() {
        if (head==null){
            System.out.println("dobly is empty");
            return;
        }
        node temp=tail;
        while (temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.prev;
        }
    }
    public void delete(int val){
        if (head == null){
            System.out.println("Empty");
            return;
        } else if (head.next==null && head.val==val) {
            head=tail=null;
        }
        else {
            node temp=head;
            while (temp.next != null){
                if (temp==head && head.val==val){
                    temp=temp.next;
                    head.next.prev=null;
                    node h=head.next;
                    head.next=null;
                    head=h;
                } else if (temp.next == tail && temp.next.val==val) {
                    temp.next.prev=null;
                    temp.next=null;
                    tail=temp;
                } else if (temp.next.val==val){
                    node help=temp.next.next;
                    temp.next.next=null;
                    temp.next=help;

                    node h2=temp.next.prev.prev;
                    temp.next.prev.prev=null;
                    temp.next.prev=h2;
                }else {
                    temp=temp.next;
                }
            }
        }
    }
}
