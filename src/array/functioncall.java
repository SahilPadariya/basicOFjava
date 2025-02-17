package array;

public class functioncall {
    public static void checkprime(int i) {
        for (int j = 2; j < i; j++) {
            if (i % j == 0) {
                return;
            }
        }
        System.out.println(i);
    }
    public static void main(String[] args) {
        int a[] = {4, 3, 6, 7, 21, 11, 15, 5};
        for (int k = 0; k < a.length; k++) {
            checkprime(a[k]);
        }
    }
}



