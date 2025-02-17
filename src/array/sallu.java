package array;

import java.util.Arrays;
public class sallu {
    public static void main(String[] args) {
        int[] nums = {10, 4, 8, 3};
        int sum = 0, sum2 = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > 0) {
                sum = sum + nums[i];
                System.out.println(sum);
            }
            for (int j = nums.length - 1; i < 2; j--) {
                if (nums[j] < 0) {
                    sum2 = sum2 + nums[i];
                    System.out.println(sum2);
                }
            }

        }
    }
}

