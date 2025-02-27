package array;

public class leetcode35 {
    public static void main(String[] args) {
        int nums[]={1,3,5,9};
        int target=8;
        int left=0,right= nums.length-1;
        while (left<=right){
            int mid=left+(right-left)/2;
            if (target==nums[mid]){
                System.out.println(mid);
                return;
            } else if (target<nums[mid]) {
                right=mid-1;

            }else {
                left=mid+1;
            }
        }
        System.out.println(left);
    }
}
