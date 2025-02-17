package array;

public class nthelement {
    public static void main(String[] args) {
        int []arry2 = {10,20,30,40,50};
        int n=arry2.length;
        int a=0;
            if (a>0 && a<=arry2.length) {
                System.out.println("your element is :" + arry2[a-1]);
            }
            else {
                System.out.println("not availble number");
            }
    }
}