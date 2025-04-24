package LinkedList;

public class checkloopinlist {
    public static void main(String[] args) {
        l8 l=new l8();
        l.insert(10);
        l.insert(20);
        l.insert(30);
        l.insert(40);
        l.insert(50);
        l.insert(60);

        l.addloop(10);

        System.out.println(l.checkloop());

    }
}
class node8{
    node8 next;
    int val;
    public node8(int val){
        this.val=val;
    }
}
class l8{
    public node8 head,tail;
    public void insert(int val){
        node8 nn=new node8(val);
        if (head==null){
            head=tail=nn;
        }
        else{
            tail.next=nn;
            tail=nn;
        }
    }
    public void addloop(int val){
        node8 temp=head;
        while (temp != null){
            if (temp.val==val){
                break;
            }
            temp=temp.next;
        }
        node8 t=head;
        while (t.next != null){
            t=t.next;
        }
        t.next=temp;
    }
    public boolean checkloop() {
        node8 slow = head, fast = head;

//        while (fast != null && fast.next != null) {
//            slow = slow.next;
//            fast = fast.next.next;
//            if (slow == fast) {
//                return true;
//            }
//        }
//        return false;
//        while (fast != null && fast.next != null){
//            slow=slow.next;
//            fast=fast.next.next;
//            if (fast == slow){
//                int c=1;
//                node8 t=slow.next;
//                while (t != slow) {
//                    t = t.next;
//                    c++;
//                }
//                System.out.println(c);
//                return true;
//            }
//        }
        int c=1;
        while (fast != null) {
            fast=fast.next.next;
            slow=slow.next;
            if (fast==slow){
                System.out.println(c);
                return true;
            }
            else {
                c++;
            }
        }
        return false;
    }

}