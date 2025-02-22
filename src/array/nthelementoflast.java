package array;

public class nthelementoflast {
    public static void main(String[] args) {
        int[] arry = {10, 20, 30, 40, 50};
        int n = arry.length;
        int a = 0;
        for (int i = n - 1; i >= 0; i--) {
            if (a<=n && a!=0) {
                System.out.println("your nt element from last is :" + arry[n-a]);
                return;
            }

        }
        System.out.println("invailid numbers");
    }
}
