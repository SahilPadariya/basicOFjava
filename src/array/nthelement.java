package array;

public class nthelement {
    public static void main(String[] args) {
        int[] arry2 = {10, 20, 30, 40, 50};
        int n = arry2.length;
        int a = 3;
        if (a > 0 && a <= n) {
            System.out.println("your element is :" + arry2[a - 1]);
        } else {
            System.out.println("not availble number");
        }
    }
}