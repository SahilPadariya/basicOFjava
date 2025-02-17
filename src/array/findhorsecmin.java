package array;

public class findhorsecmin {
    public static void main(String[] args) {
        int a=328905,h=0,m=0,s=0;
        h=a/3600 ;
        a=a%3600;
        m=a/60;
        s=a%60;
        System.out.println(h+" "+m+" "+s);
    }
}
