package array;

import java.util.Arrays;

public class reversearrayinarray {
        public static void main(String[] args) {
            int[]array={11,12,13,14,15};
            int i=array.length-1,j=0,temp;
            while (i>j) {
                temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i--;
                j++;
            }
            System.out.println(Arrays.toString(array));
        }
}
