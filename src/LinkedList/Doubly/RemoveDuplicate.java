package LinkedList.Doubly;

public class RemoveDuplicate {
    public static void main(String[] args) {
        lisnkedList4 ll = new lisnkedList4();
        ll.insert(10);
        ll.insert(20);
        ll.insert(20);
//        ll.insert(20);
//        ll.insert(20);
//        ll.insert(20);
//        ll.insert(20);
//        ll.insert(20);
//        ll.insert(30);
//        ll.insert(30);
//        ll.insert(30);
//        ll.insert(30);
//        ll.insert(30);
//        ll.insert(30);
//        ll.insert(30);
//        ll.insert(30);
//        ll.insert(30);
//        ll.insert(30);
//        ll.insert(30);

        ll.Remove();
        ll.print();
        System.out.println();
        ll.printrev();
    }
}
class lisnkedList4{
    node head,tail;
     public void insert(int val){
         node nn = new node(val);
         if (head==null){
             head=tail=nn;
         }
         else {
             nn.prev=tail;
             tail.next=nn;
             tail=nn;
         }
     }
     public void Remove(){
         if (head==null){
             System.out.println("Empty");
             return;
         }
         node temp=head;
         while (temp.next != null){
             if (temp.next.val==temp.val){
                 if (temp.next.next==null){
                     temp.next.prev=null;
                     temp.next=null;
                 }else {
                     node help = temp.next.next;
                     temp.next.prev = null;
                     temp.next.next = null;
                     temp.next = help;
                     temp.next.prev = temp;
                 }
             }else {
                 temp=temp.next;
             }
         }
         tail=temp;
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
