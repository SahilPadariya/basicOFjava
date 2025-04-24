package LinkedList.Doubly;

public class findPairSum {
    public static void main(String[] args) {
        linledlist linledlist=new linledlist();
        linledlist.insert(1);
        linledlist.insert(2);
        linledlist.insert(3);
        linledlist.insert(4);
        linledlist.insert(5);

        linledlist.findpairsum(7);
    }
}
class linledlist{
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

    public void findpairsum(int sum) {
        if (head==null){
            System.out.println("Empty");
            return;
        }
        node start=head,end=tail;
        while (start != end){
            int mainsum=start.val+end.val;
            if (mainsum==sum){
                System.out.println("Present");
                return;
            } else if (sum>mainsum) {
                start=start.next;
            }else {
                end = end.prev;
            }
        }
        System.out.println("Not Present");
    }
}
