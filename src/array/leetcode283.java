package array;

import java.util.Arrays;

public class leetcode283 {
    public static void main(String[] args) {
        int nums[]={4,2,4,0,0,3,0,5,1,0};
        int k=0;
        for (int i=0;i< nums.length;i++){
            if (nums[k]==0 && nums[i]!=0){
                int swap=nums[i];
                nums[i]=nums[k];
                nums[k]=swap;
                k++;
            }
            if (nums[k]!=0) {
                k++;
                continue;
            }
            else if (nums[k]==0) {
                continue;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
