package LinkedList;

public class RemoveDuplicateUnsorted {
    public static void main(String[] args) {
        LinkedList21 ll = new LinkedList21();
        ll.insert(10);
        ll.insert(20);
        ll.insert(10);
        ll.insert(30);
        ll.insert(20);
        ll.insert(40);
        ll.insert(10);
        ll.insert(50);
        ll.insert(20);

        ll.Removeduplicats();

        ll.print();
    }
}
class LinkedList21{
    node head,tail;
    public void insert(int val){
        node nn=new node(val);
        if (head==null){
            head=tail=nn;
        }
        else {
            tail.next=nn;
            tail=nn;
        }
    }
    public void Removeduplicats(){
        if (head==null){
            System.out.println("Empty");
            return;
        }
        node temp=head;
        while (temp!=null){
            node help=temp.next;
            node prev=temp;
            while (help != null){
                if (help.data==temp.data){
                    prev.next=help.next;
                    help.next=null;
                    help=prev.next;
                }else {
                    prev=help;
                    help=help.next;
                }
            }
            if (temp.next==null){
                tail=temp;
                return;
            }
            temp=temp.next;
        }
    }
    public void print() {
        if (head==null){
            System.out.println("empty");
            return;
        }
        node temp=head;
        while (temp!= null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
}
