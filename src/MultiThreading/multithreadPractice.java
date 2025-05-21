package MultiThreading;

public class multithreadPractice {
    public static void main(String[] args) {
        test thread=new test();
        thread.start();
        for (; ;){
            System.out.println(Thread.currentThread().getName());
        }
    }
}
class test extends Thread{
    @Override
    public void run() {
        for (; ;){
            System.out.println(Thread.currentThread().getName());
        }
    }
}

