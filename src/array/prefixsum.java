package array;

public class prefixsum {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int j=0;
        int sum=0,l=1,r=3;
        for (int i=l;i<=r;i++)
        {
            sum=sum+a[i];
            System.out.println(sum);

        }

    }
}
