package LinkedList.Doubly;

public class ReverseList {
    public static void main(String[] args) {
        LinkedList ll=new LinkedList();
        ll.insert(10);
        ll.insert(20);
        ll.insert(30);
        ll.insert(40);
        ll.insert(50);

        ll.reverse();

        ll.print();
        System.out.println();
        ll.printrev();
    }
}
class LinkedList{
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
    public void reverse(){
        if (head==null){
            System.out.println("Empty");
            return;
        }
        if (head.next==null){
            System.out.println("Not vailid");
            return;
        }
        node cur=head;
        node previos=null;
        while (cur != null){
            node next=cur.next;
            cur.next=previos;
            cur.prev=next;
            previos=cur;
            cur=next;
        }
        tail=head;
        head=previos;
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
}
