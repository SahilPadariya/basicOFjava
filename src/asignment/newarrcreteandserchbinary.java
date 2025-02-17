package asignment;

import java.util.Arrays;

public class newarrcreteandserchbinary {
    public static void main(String[] args) {
        int a[]={1,1,1,1,1,0};
        int a2[]=new int[a.length];
        int left=0;
        int right= a.length-1;
        for (int i= 0;i<a.length;i++) {
            if (a[i] == 0) {
                a2[left] = a[i];
                left++;
            }
            if (a[i] == 1) {
                a2[right] = a[i];
                right--;
            }
        }
        System.out.println(Arrays.toString(a2));
    }
}
