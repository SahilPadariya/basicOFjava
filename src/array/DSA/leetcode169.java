package array.DSA;

public class leetcode169 {
    public static void main(String[] args) {
        int nums[]={3,2,3};
        int maincount=0;
        int ele=nums[0];
        for(int i=0;i<nums.length;i++){
            int count=1;
            if(nums[i]==-1){
                continue;
            }
            for(int j=i+1;j<nums.length;j++) {
                if (nums[i] == nums[j]) {
                    count++;
                    nums[j] = -1;
                }
            }
                if(count>maincount){
                    maincount=count;
                    ele=nums[i];
                }
        }
        System.out.println(ele);
    }
}

