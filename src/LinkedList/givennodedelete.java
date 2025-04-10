package LinkedList;

public class givennodedelete {
    public static void main(String[] args) {

        l6 l=new l6();
        l.insert(10);
        l.insert(20);
        l.insert(30);
        l.insert(40);
        l.insert(50);

        l.delet(40);
        l.print();

    }
}
class node4 {
    node4 next;
    int val;

    public node4(int val) {
        this.val = val;
    }
}
class l6{
    node4 head,tail;
    public void insert(int val){
        node4 nn=new node4(val);
        if (head==null){
            head=tail=nn;
        }
        else{
            tail.next=nn;
            tail=nn;
        }
    }
    public void delet(int val){
        if (head==null){
            System.out.println("LinkedList Is Empty");
            return;
        }
        node4 temp=head;
        while (temp != null){
            if (temp.val==val){
                if (temp == tail){
                    System.out.println("This Element Can`t Delete");
                    return;
                }
                deletenode(temp);
                return;
            }
            temp=temp.next;
        }
        System.out.println("Not Vailid Number");
    }
    public void deletenode(node4 nodeno){
        while (nodeno.next.next != null){
            nodeno.val=nodeno.next.val;
            nodeno=nodeno.next;

        }
        nodeno.val=nodeno.next.val;
        nodeno.next=null;
//        node4 temp=nodeno.next.next;
//        nodeno.val=nodeno.next.val;
//        nodeno.next.next=null;
//        nodeno.next=temp;
    }
    public void print(){
        if (head==null){
            System.out.println("LinkedList is empty");
            return;
        }
        node4 n=head;
        while (n != null ){
            System.out.println(n.val);
            n=n.next;
        }
    }
}

