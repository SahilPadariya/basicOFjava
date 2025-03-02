package array;

import java.util.HashSet;

public class leetcode217 {
    public static void main(String[] args) {
        int nums[]={1,2,3};
        HashSet<Integer> hs=new HashSet<>();
        for (int i=0;i<nums.length;i++){
            hs.add(nums[i]);
            System.out.println("true");
            return;
        }
        System.out.println("false");
    }
}
