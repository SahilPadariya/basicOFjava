package Queue;

public class Circular {
    static int front=-1,rear=-1;
    static int arr[]=new int[5];

    public static void main(String[] args) {

//        add(10);
//        add(10);
//        add(10);
//        add(10);
//        add(10);
//
//        delete();
//        delete();
//        delete();
//        delete();
//        delete();
//
//        add(10);
//        add(10);
//        add(10);
//        add(10);
//        add(10);
//
//        delete();
//        delete();
//        delete();
//        delete();
//        delete();

        add(10);
        add(20);
        add(30);
        add(40);
        add(50);
        delete();
        delete();
        add(60);
        add(70);
        print();
    }
    public static void add(int val){
       if ((rear+1)%arr.length==front){
           System.out.println("arr is full");
           return;
       } else if (front==-1) {
           front=0;
       }
       rear=(rear+1)%arr.length;
       arr[rear]=val;
    }
    public static void delete() {
        if(rear==-1){
            System.out.println("arr is empty");
            return;
        } else if (front==rear) {
            front=rear=-1;
        }else {
            front=(front+1)%arr.length;
        }
    }
    public static void print(){
        if (rear==-1){
            System.out.println("arr is empty");
            return;
        }
        int i=front;
        while (i!=rear){
            System.out.println(arr[i]);
            i=(i+1)%arr.length;
        }
        System.out.println(arr[i]);
    }
}
