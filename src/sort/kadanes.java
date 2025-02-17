package sort;

public class kadanes {
    public static void main(String[] args) {
        int a[]={-5,2,4,-7,6,-3,5,9,-8,7};
        int maxsum=Integer.MIN_VALUE;
        int cursum=0;
        for (int i=0; i<a.length;i++) {
            cursum = cursum + a[i];
            if (cursum > maxsum) {
                maxsum = cursum;
            }
            if (cursum < 0) {
                cursum = 0;
            }
        }
        System.out.println(maxsum);
    }
}

