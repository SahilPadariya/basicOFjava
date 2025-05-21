package MultiThreading;

import javax.swing.*;

public class AssQu1 {
    //    public static void main(String[] args) {
//        Thread1 thread1=new Thread1();
//        Thread2 thread2=new Thread2();
//        thread1.start();
//        try {
//            Thread.sleep(500);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        thread2.start();
//    }
//}
//
//class Thread1 extends Thread {
//    @Override
//    public void run() {
//        for (int i=1;i<=100;i=i+2){
//            System.out.println(i+" - "+Thread1.currentThread().getName());
//            try {
//                Thread1.sleep(1000);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        }
//    }
//}
//
//class Thread2 extends Thread {
//    @Override
//    public void run() {
//        for (int i=2;i<=100;i=i+2){
//            System.out.println(i+" - "+Thread1.currentThread().getName());
//            try {
//                Thread1.sleep(1000);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        }
//    }
//}
    public static void main(String[] args) {
        int N=10;
        print p=new print(N);
        print2 p2=new print2(N);
        p.start();
        p.start();
    }
}
class print extends Thread{
    int N;
    public print(int N){
        this.N=N;
    }
    public void isOdd(){
    }
}
class print2 extends Thread{
    int N;
    public print2(int N){
        this.N=N;
    }
    public void isEven(){
        for (int i=2;i<=N;i+=2){
            System.out.println(i+Thread.currentThread().getName());
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            notify();
        }
    }
}


