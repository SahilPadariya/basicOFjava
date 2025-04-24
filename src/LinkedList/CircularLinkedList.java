package LinkedList;

public class CircularLinkedList {
    public static void main(String[] args) {
        LinkdeList ll=new LinkdeList();
        ll.inser(10);
        ll.inser(20);
//        ll.inser(30);
//        ll.inser(40);
//        ll.inser(50);
//        ll.inser(60);

        ll.Exchangenode();
        ll.print();
//        System.out.println(ll.chexkcircular());
    }
}//tail create because check circular function worked properly or not

//create node class and constructor assign value in data veriable nd next is store address in node object
class node13{
    node13 next;
    int data;
    public node13(int data) {
        this.data = data;
    }
}
//create LinkedList class and create node type head
class LinkdeList{
    node13 head;
//    node13 tail;
    //this use assign value in linkedlist
    public void inser(int data){
        node13 nn=new node13(data);
        //list is empty so direct add new node and head next in new node
        if (head==null){
//            head=tail=nn;
            head=nn;
            head.next=nn;
        }
        //many node so first find who node have next is head and than add this address add node and this node next add head
        else{
            node13 temp=head;
            while (temp.next != head){
                temp=temp.next;
            }
            temp.next=nn;
            temp.next.next=head;
//            tail.next=nn;
//            tail=nn;
        }
    }
    //this function check is last node next is head or null(null==false || head==true)
    public boolean chexkcircular(){
        node13 temp=head;
        if (head==null) {
            System.out.println("List Is Empty");
            return false;
        }
        else {
            while (temp.next != head){
                if (temp.next == null){
                    return false;
                }
                temp=temp.next;
            }
        }
            return true;
    }
    //print list all node but last node print out of loop because temp next is head so last print out of loop
    public void print(){
        if (head==null){
            System.out.println("List Is Empty");
            return;
        }
        node13 tamp=head;
        while (tamp.next != head){
            System.out.println(tamp.data);
            tamp=tamp.next;
        }
        System.out.println(tamp.data);
    }
    public void Exchangenode(){
        node13 temp=head;
        while(temp.next.next != head){
            temp=temp.next;
        }
        temp.next.next=head.next;
        head.next=temp.next;
        temp.next=head;
        head=head.next;
    }
}
