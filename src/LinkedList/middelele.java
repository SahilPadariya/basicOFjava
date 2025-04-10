package LinkedList;

public class middelele {
    public static void main(String[] args) {
        l7 l=new l7();
        l.insert(10);
        l.insert(20);
        l.insert(30);
        l.insert(40);
        l.insert(50);
        l.insert(60);
        l.insert(70);
        l.insert(80);
        l.insert(90);
        l.insert(100);
        l.insert(110);
        l.insert(120);

        l.middel();
    }
}
class node7{
    node7 next;
    int val;
    public node7(int val){
        this.val=val;
    }
}
class l7{
    node7 head,tail;
     public void insert(int val){
         node7 nn=new node7(val);
         if (head==null){
             head=tail=nn;
         }
         else{
             tail.next=nn;
             tail=nn;
         }
     }
     public void middel(){
         if (head == null){
             System.out.println("List Is Empty");
             return;
         }
         node7 temp1=head,temp2=head;

         while (temp2 != null && temp2.next != null) {
             if (temp2.next.next==null){
                 System.out.println(temp1.val);
                 return;
             }
             temp1 = temp1.next;
             temp2 = temp2.next.next;
         }
         System.out.println(temp1.val);
     }
}
