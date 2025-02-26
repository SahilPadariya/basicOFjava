package array;

import java.util.Arrays;

public class leetcode169 {
    public static void main(String[] args) {
        int []nums={3,2,3};
        int ans=nums[0];
        int vote=1;
        for (int i=1;i<nums.length;i++){
            if (nums[i]==ans){
                vote++;
            }else {
                vote--;
            }
            if (vote==0){
                ans=nums[i];
                vote=1;
            }
        }
        System.out.println(ans);
    }
}
