package LinkedList.Doubly;

public class Ciculer {
    public static void main(String[] args) {
        LinkedList23 ll = new LinkedList23();
        ll.insert(10);
        ll.insert(20);
        ll.insert(30);
        ll.insert(40);
        ll.insert(50);
        ll.insert(60);
        ll.insert(70);
        ll.insert(80);

        ll.circuler();
        ll.exchange();

        ll.print();
        System.out.println();
        ll.printrev();
    }
}
class LinkedList23{
    node head,tail;
    public void insert(int val){
        node nn=new node(val);
        if (head==null){
            head=tail=nn;
        }
        else {
            nn.prev=tail;
            tail.next=nn;
            tail=nn;
        }
    }
    public void circuler(){
        if (head==null){
            System.out.println("dobly is empty");
            return;
        }
        head.prev=tail;
        tail.next=head;
    }
    public void exchange() {
        if (head==null){
            System.out.println("empty");
            return;
        }
        if (head.next==head){
            System.out.println("Not Exchange");
            return;
        }
        else if (head.next==tail){
            node help=tail;
            help.next=head;
            head.next=null;
            help.next.prev=help;
            help.next.next=help;

            tail=head;
            head=help;
            return;
        }
        node t1 = tail.prev;
        node t2 = head.next;

        t1.next = head;
        t1.next.prev = t1;
        t2.prev = tail;
        tail.next = t2;
        tail.prev = t1.next;
        t1.next.next=t2.prev;

        head = t2.prev;
        tail = t1.next;
    }
    public void print(){
        if (head==null){
            System.out.println("Empty");
            return;
        }
        node temp=head;
        while (temp.next != head){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
        System.out.print(temp.val);
    }
    public void printrev(){
        if (head==null){
            System.out.println("Empty");
            return;
        }
        node temp=tail;
        while (temp.prev != tail){
            System.out.print(temp.val+" ");
            temp=temp.prev;
        }
        System.out.print(temp.val);
    }
}
