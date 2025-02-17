package sort;

public class findpairofsumtwopointer {
    public static void main(String[] args) {
        int nums[]={3,2,4};
        int target=6;
//        int left=0;
//        int right=nums.length-1;
//        while (left<right) {
//            if (find == a[left]+a[right]) {
//                System.out.println(a[left]+" "+a[right]);
//                return;
//            } else if (find <a[left]+a[right]) {
//                right--;
//            } else {
//                left++;
//            }
//        }
//        System.out.println("not");
        int left=0;
        int right=nums.length-1;
        while(left<right){
            if(target==nums[left]+nums[right]){
                System.out.println(left+" "+right);
                return;
            }
            else if(target>nums[left]+nums[right]){
                left++;
            }
            else{
                right--;
            }
        }
        System.out.println("not found");
    }
}



