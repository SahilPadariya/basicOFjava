package array;

public class rev {
    public static void main(String[] args) {
        int a=8569,rem=0,rev=0,sum=0, mul = 1;
        for (int i = a; i > 0; i = i / 10) {

            rem = i % 10;
            sum = sum + rem;
            mul = mul * rem;
            rev = (rev * 10) + rem;

        }

        System.out.println(sum);
        System.out.println(mul);
        System.out.println(mul-sum);
    }
}
