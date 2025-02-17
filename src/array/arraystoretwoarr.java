package array;
import java.util.Arrays;
public class arraystoretwoarr {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5, 6};
        int n = a.length / 2;
        int a1[] = new int[n];
        int a2[] = new int[n];
        for (int i=0;i<n;i++){
            a1[i]=a[i];
            a2[i]=a[n+i];
        }
        System.out.print(Arrays.toString(a1));
        System.out.print(Arrays.toString(a2));
    }

}
