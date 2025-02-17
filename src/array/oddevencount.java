package array;

public class oddevencount {
    public static void main(String[] args) {
        int[] arry2 = {11, 12, 13, 14, 15};
        int n = arry2.length, odd = 0, even = 0;
        int i;
        for (i = 0; i < n; i++) {
            if (arry2[i]% 2 == 0) {
                even++;
            } else {
                odd++;
            }


        }
        System.out.println("even :" + even);
        System.out.println("odd :" + odd);
    }
}
