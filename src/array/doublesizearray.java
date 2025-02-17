package array;

import java.util.Arrays;

public class doublesizearray {
    public static void main(String[] args) {
        int[] array1 = {10, 20, 30, 40, 50};
        int[] array2 = new int[array1.length * 2];
        for (int i = 0; i < array1.length; i++) {
            array2[i] = array1[i];
            array2[i+array1.length] = array1[i];
        }
        System.out.println(Arrays.toString(array2));
    }
}






