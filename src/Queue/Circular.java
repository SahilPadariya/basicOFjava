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

        add(50);
        add(60);
        add(70);
        add(80);
        delete();
        delete();
        add(90);
        add(100);
        add(110);
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
        if(front==-1){
            System.out.println("arr is empty");
            return;
        } else if (front==rear) {
            front=rear=-1;
        }else {
            front=(front+1)%arr.length;
        }
    }
    public static void print(){
        if (front==-1){
            System.out.println("arr is empty");
            return;
        }
        int i=front;
        while (true){
            System.out.println(arr[i]);
            if (i==rear){
                break;
            }
            i=(i+1)%arr.length;
        }
    }
}
