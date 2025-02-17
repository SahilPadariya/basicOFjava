package array;

public class powerofnum {
    public static void main(String[] args) {
        int a=5,b=3,c=1;
        for (int i=b;i>=0;i--){
            if (i!=0) {
                c = c * a;
            }
        }
        System.out.println(c);

    }

}
