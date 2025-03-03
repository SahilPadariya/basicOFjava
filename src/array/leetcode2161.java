package array;

import java.util.Arrays;

public class leetcode2161 {
    public static void main(String[] args) {
        int nums[]={-3,4,3,2};
        int nums1[]=new int[nums.length];
        int pivot=2,k=0,count=0;
        for (int i=0;i< nums.length;i++){
            if (nums[i]<pivot){
                nums1[k]=nums[i];
                k++;
            } else if (pivot==nums[i]){
                count++;
            }
        }
        while (0<count){
            nums1[k]=pivot;
            count--;
            k++;
        }
        for (int i=0;i<nums.length;i++){
            if (pivot<nums[i]){
                nums1[k]=nums[i];
                k++;
            }
        }
        System.out.println(Arrays.toString(nums1));
    }
}
