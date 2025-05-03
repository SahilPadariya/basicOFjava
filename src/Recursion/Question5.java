package Recursion;

public class Question5 {
    public static void main(String[] args) {
        System.out.println(countdigit(10));
    }
    public static int countdigit(int n) {
        if (n == 1) {
            return 1;
        }
        return 1 + countdigit(n / 10);
    }
}
