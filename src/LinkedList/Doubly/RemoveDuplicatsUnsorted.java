package LinkedList.Doubly;

public class RemoveDuplicatsUnsorted {
    public static void main(String[] args) {
        LinkedList22 ll=new LinkedList22();
        ll.insert(20);
        ll.insert(20);
        ll.insert(20);
        ll.insert(20);
        ll.insert(20);
        ll.insert(20);
        ll.insert(20);
        ll.insert(20);
        ll.insert(20);

        ll.RemoveDuplicat();

        ll.print();
        System.out.println();
        ll.printrev();
    }
}
class LinkedList22 {
    node head, tail;
    public void insert(int val){
        node nn = new node(val);
        if (head==null){
            head=tail=nn;
        }
        else{
            nn.prev=tail;
            tail.next=nn;
            tail=nn;
        }
    }
    public void RemoveDuplicat(){
        if (head==null){
            System.out.println("Empty");
            return;
        }
        node temp=head;
        while(temp!= null){
            node help=temp.next;
            node previous=temp;
            while (help != null){
                if (help.val==temp.val){
                    if (help.next==null){
                        previous.next=null;
                        help.prev=null;
                        tail=previous;
                        return;
                    }
                    previous.next=help.next;
                    help.next=null;
                    help.prev=null;
                    previous.next.prev=previous;
                    help=previous.next;
                }
                else {
                    previous=help;
                    help=help.next;
                }
            }
            temp=temp.next;
        }
    }
    public void print() {
        if (head == null) {
            System.out.println("dobly is empty");
            return;
        }
        node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
    }

    public void printrev() {
        if (head == null) {
            System.out.println("dobly is empty");
            return;
        }
        node temp = tail;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.prev;
        }
    }
}
