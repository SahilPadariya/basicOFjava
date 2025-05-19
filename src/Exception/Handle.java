package Exception;

public class Handle {
    public static void main(String[] args) {
        try {
            try {
                System.out.println(10 / 0);
            } catch (ArithmeticException e) {
                System.out.println("Divide zero");
            }
            try {
                Integer i = null;
                System.out.println(5 + i);
            } catch (NullPointerException e) {
                System.out.println("not a sum with null");
            }
            try {
                String s = "sahil";
                System.out.println(s.charAt(10));
            } catch (StringIndexOutOfBoundsException e) {
                System.out.println("String out of bounce");
            }
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}