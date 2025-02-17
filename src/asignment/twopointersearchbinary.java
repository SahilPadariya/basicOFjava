package asignment;

import java.util.Arrays;

public class twopointersearchbinary {
    public static void main(String[] args) {
        int a[] = {1, 0, 0, 0, 1};
        int left = 0;
        int right = a.length - 1;
        while (left < right) {
            if (a[left] == 0) {
                left++;
            }
            if (a[right] == 1) { 
                right--;
            }
            if (a[left] == 1 && a[right] == 0) {
                int temp = a[right];
                a[right] = a[left];
                a[left] = temp;
                left++;
                right--;
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
