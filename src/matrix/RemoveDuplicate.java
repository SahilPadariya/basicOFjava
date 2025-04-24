package matrix;

public class RemoveDuplicate {
    public static void main(String[] args) {
        l9 l=new l9();
        l.insert(10);
        l.insert(10);
        l.insert(10);
        l.insert(10);
        l.insert(10);
        l.insert(10);

        l.removeduplicat();
        l.print();
    }
}
class node9{
    node9 next;
    int val;
    public node9(int val){
        this.val=val;
    }
}
class l9{
    node9 head,tail;
     public void insert(int val){
         node9 nn=new node9(val);
         if (head==null) {
             head = tail = nn;
         }
         else {
             tail.next = nn;
             tail=nn;
         }
     }

    public void removeduplicat(){
         if (head==null){
             System.out.println("List Is Empty");
             return;
         }
         node9 temp=head;
         while (temp != null && temp.next != null){
             if (temp.val == temp.next.val) {
//                 while (temp.next != null && temp.val == temp.next.val) {
                     node9 rem = temp.next.next;
                     temp.next.next = null;
                     temp.next = rem;
//                 }
             }
             else {
                 temp=temp.next;
             }

         }
    }
    void print() {
        node9 temp = head;
        if (temp == null) {
            System.out.println("LinkedList is Empty");
            return;
        } else {
            while (temp != null) {
                System.out.print(temp.val + " ");
                temp = temp.next;
            }
        }
    }
}
