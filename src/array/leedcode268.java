package array;

import java.util.Arrays;

public class leedcode268 {
    public static void main(String[] args) {
        int nums[]=new int[2];
        nums[0]=0;
        nums[1]=1;
        int sum=0;
        Arrays.sort(nums);
        //0,1,2,3,4,5,6,7,9
        int index=0;
        for (int i=1;i<nums.length;i++) {
            if (nums[i] - nums[index] != 1) {
                sum = (nums[i] + nums[index]) / 2;
            } else {
                index++;
            }
            if (nums[i] == 0){
                sum=nums.length;
            }
        }
        System.out.println(sum);
    }
}
