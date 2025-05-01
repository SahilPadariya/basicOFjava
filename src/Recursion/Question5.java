package Recursion;

public class Question5 {
    public static void main(String[] args) {
        System.out.println(countdigit(10));
    }
    public static int countdigit(int n) {
        if (n == 0) {
            return 0;
        }
        return 1 + countdigit(n / 10);
    }
}
