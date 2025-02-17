package array.DSA;

import java.util.Arrays;

public class leetcode1389 {
    public static void main(String[] args) {
        int nums[]={0,1,2,3,4};
        int index[]={0,1,2,2,1};
        int target[]=new int[nums.length];
        for (int i=0;i<nums.length;i++){
            if (index[i]==nums[i]){
               target[i]=nums[i];
            }
            else {
                
            }
        }
        System.out.println(Arrays.toString(target));
    }
}
