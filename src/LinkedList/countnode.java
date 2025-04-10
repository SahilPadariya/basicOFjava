package LinkedList;

public class countnode {
    public static void main(String[] args) {
        l2 l1=new l2();
        l1.insert(10);
        l1.insert(20);
        l1.insert(30);
        l1.insert(40);
        l1.insert(50);

        l1.countNode();
    }
}
class node2{
    node2 next;
    int val;

    public node2(int val){
        this.val=val;
    }
}
class l2{
    node2 head,tail;
    public void insert(int val){
        node2 nn=new node2(val);
        if (head==null){
            head=tail=nn;
        }
        else{
            tail.next=nn;
            tail=nn;
        }
    }
    public void countNode(){
        if (head==null){
            System.out.println("LinkedList is empty");
            return;
        }
        node2 temp=head;
        int count=0;
        while (temp!=null){
            count++;
            temp=temp.next;
        }
        System.out.println(count);
    }
}
