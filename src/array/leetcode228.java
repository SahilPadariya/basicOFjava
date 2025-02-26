package array;

import java.util.ArrayList;
import java.util.Arrays;

public class leetcode228 {
    public static void main(String[] args) {
        int nums[]={0,1,2,4,5,7};
        int mainindex=0;
        int k=0;
        ArrayList<String> arrayList = new ArrayList<>();
        for (int i = 1; i< nums.length; i++){
            if (nums[i]-nums[k]==1) {
                k++;
            }else {
                arrayList.add(nums[mainindex] + "-->" + nums[k]);
                k++;
                mainindex = k;
            }

        }
        System.out.println(arrayList);
    }
}
