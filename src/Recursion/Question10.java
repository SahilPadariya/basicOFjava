package Recursion;

public class Question10 {
    public static void main(String[] args) {
        System.out.println(prime(2,2));
    }
    public static boolean prime(int n,int i) {
        if (n == 1) return false;
        if (i == n) return true;
        if (n % i == 0) return false;
        return prime(n, i + 1);
    }
}
