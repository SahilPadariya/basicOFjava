package LinkedList.Doubly;

public class InsertvalueinPosition {
    public static void main(String[] args) {
        Linkedlist2 ll=new Linkedlist2();
        ll.insert(10);
        ll.insert(20);
        ll.insert(30);
        ll.insert(40);
        ll.insert(50);

        ll.Inser_In_Correct_Position(5);
        ll.Inser_In_Correct_Position(60);
        ll.Inser_In_Correct_Position(31);

        ll.print();
        System.out.println();
        ll.printrev();
    }
}
class Linkedlist2 {
    node head, tail;

    public void insert(int val) {
        node nn = new node(val);
        if (head == null) {
            head = tail = nn;
        } else {
            nn.prev = tail;
            tail.next = nn;
            tail = nn;
        }
    }

    public void Inser_In_Correct_Position(int val) {
        node nn = new node(val);

        if (head == null) {
            head = tail = nn;
        } else if (head.val >= val) {
            nn.next = head;
            head.prev = nn;
            head = nn;
            return;
        } else if (tail.val <= val) {
            tail.next = nn;
            nn.prev = tail;
            tail = nn;
        } else {
            node temp=head;
            while (temp != null){
                if (temp.val>=val){
                    nn.next=temp;
                    nn.prev=temp.prev;
                    temp.prev=nn;
                    temp.prev.prev.next=nn;
                    return;
                }
                temp=temp.next;
            }
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
