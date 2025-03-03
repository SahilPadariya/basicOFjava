package array;

public class leetcode219 {
    public static void main(String[] args) {
        int nums[]={1,2,3,1,2,3};
        int find=2,count=0;
        int left=0,right=1;
        while (left<nums.length){
            if (nums[left]==nums[right]){
                if (Math.abs(left-right)<=find){
                    System.out.println("true");
                    return;
                }
            }
            else {
               right++;
            }
        }
        System.out.println("no available");
    }
}
