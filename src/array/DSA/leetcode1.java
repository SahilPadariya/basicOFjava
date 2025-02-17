package array.DSA;

import java.util.Arrays;

public class leetcode1 {
    public static void main(String[] args) {
        int nums[]={3,2,4};
        int target=6;
        int left=0;
        int right=nums.length-1;
        while(left<right){
            int sum=nums[left]+nums[right];
            if(target==sum){
//                return new int []{left,right};
                System.out.println("present");
            }
            if(target>sum){
                left++;
            }
            else{
                right--;
            }
        }
        int[] arr={left,right};
//        return arr;
        System.out.println(Arrays.toString(arr));
    }
}
