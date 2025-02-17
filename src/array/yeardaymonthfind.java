package array;

public class yeardaymonthfind {
    public static void main(String[] args) {
        int a=500;
        int y=0,m=0,d=0;
        y=a/365;
        a=a%365;
        m=a/30;
        d=a%30;
        System.out.println(y+" "+m+" "+d);
    }
}
