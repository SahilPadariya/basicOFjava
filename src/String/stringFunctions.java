package String;

public class stringFunctions {
    public static void main(String[] args) {
        String name=new String("sahil");
        String name1=" sahil ";
        String arr[]=name.split(" ");
        System.out.println(name.length());
        System.out.println(name.charAt(0));
        System.out.println(name1.trim());
        System.out.println(name.equals(name1));
        System.out.println();
    }
}
