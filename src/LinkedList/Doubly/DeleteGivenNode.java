package LinkedList.Doubly;

public class DeleteGivenNode {
    public static void main(String[] args) {
        LinkedList20 ll=new LinkedList20();
        ll.insert(10);
        ll.insert(20);
        ll.insert(30);
        ll.insert(10);
        ll.insert(50);
        ll.insert(70);

        ll.DeletNode(10);


        ll.print();
        System.out.println();
        ll.printrev();

    }
}
class LinkedList20{
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
    public void DeletNode(int val){
        if (head==null){
            System.out.println("Empty");
            return;
        }else {
            node temp=head.next;
            while (temp != null){
                if (temp.val==val){
                    GivenNodeDelet(temp);
                    return;
                }else {
                    temp=temp.next;
                }
            }
            System.out.println("Not Found This Number");
        }
    }

    private void GivenNodeDelet(node del) {
            node temp = del.prev;
            temp.next=del.next;
            del.next.prev=temp;
            del.next=null;
            del.prev=null;
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
