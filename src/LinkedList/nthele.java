package LinkedList;


public class nthele {
    public static void main(String[] args) {
        linkedlist3 l=new linkedlist3();
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

        l.nthele(6);

        l.nthlastele(5);

    }
}
class node3{
    node3 next;
    int val;
    public node3(int val){
        this.val=val;
    }
}
class linkedlist3{
    node3 head,tail;

    public void insert(int val){
        node3 nn=new node3(val);

        if (head==null){
            head=tail=nn;
        }
        else{
            tail.next=nn;
            tail=nn;
        }
    }
    public void nthele(int k){
        if (k==0){
            System.out.println("Not Vailid Number");
            return;
        }
        node3 temp=head;
         while (temp != null){
             k--;
             if (k==0){
                 System.out.println(temp.val);
                 return;
             }
             temp=temp.next;
         }
         if (k>0){
             System.out.println("Out Of Lenth");
             return;
         }
    }
    public void nthlastele(int k){
        if (k==0){
            System.out.println("Not Vailid Number");
            return;
        }
        node3 temp1=head,temp2=head;
        int c=0;
        while (temp2 != null){
            if (c==k){
                temp1=temp1.next;
            }
            else {
                c++;
            }
            temp2=temp2.next;
        }
        if (k==c) {
            System.out.println(temp1.val);
        }
        else {
            System.out.println("Out Of Length");
        }
    }
}
