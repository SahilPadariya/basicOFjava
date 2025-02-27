package array;

import java.util.ArrayList;
import java.util.Arrays;

public class leetcode228 {
    public static void main(String[] args) {
        int nums[]={0,1,2,4,5,7};
        int mainindex=0;
        ArrayList<String> arrayList = new ArrayList<>();
        for (int i = 1; i<=nums.length; i++){
            if (i== nums.length || nums[i]!=nums[i-1]+1) {
                if (mainindex==i-1){
                    arrayList.add(String.valueOf(nums[mainindex]));
                }
                else {
                    arrayList.add(nums[mainindex]+"-->"+nums[i-1]);
                }
                mainindex=i;
            }

        }
        System.out.println(arrayList);
    }
}

