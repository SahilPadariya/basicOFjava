package MultiThreading;

class PrintNumbers {
    private int N;
    private boolean isOddTurn = true; // Flag to control alternation

    public PrintNumbers(int N) {
        this.N = N;
    }

    public synchronized void printOdd() {
        for (int i = 1; i <= N; i += 2) {
            while (!isOddTurn) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(i + " - " + Thread.currentThread().getName());
            isOddTurn = false;
            notify();
        }
    }

    public synchronized void printEven() {
        for (int i = 2; i <= N; i += 2) {
            while (isOddTurn) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(i + " - " + Thread.currentThread().getName());
            isOddTurn = true;
            notify();
        }
    }
}

class OddThread extends Thread {
    private PrintNumbers printNumbers;

    public OddThread(PrintNumbers printNumbers) {
        this.printNumbers = printNumbers;
    }

    @Override
    public void run() {
        printNumbers.printOdd();
    }
}

class EvenThread extends Thread {
    private PrintNumbers printNumbers;

    public EvenThread(PrintNumbers printNumbers) {
        this.printNumbers = printNumbers;
    }

    @Override
    public void run() {
        printNumbers.printEven();
    }
}

public class Q1 {
    public static void main(String[] args) {
        int N = 10; // Change N as needed
        PrintNumbers printNumbers = new PrintNumbers(N);

        Thread oddThread = new OddThread(printNumbers);
        Thread evenThread = new EvenThread(printNumbers);

        oddThread.start();
        evenThread.start();
    }
}