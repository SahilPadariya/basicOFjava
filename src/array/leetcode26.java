package array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class leetcode26 {
    public static void main(String[] args) {
        int []nums1={0,0,0,0,1,1,1,1,1,1,1,2,2,2,2,2};
        int j=1;
        for (int i=1;i<nums1.length;i++){
            if (nums1[i]!=nums1[i-1]){
                nums1[j]=nums1[i];
                j++;
                }
        }
        System.out.println(j);
    }
}
