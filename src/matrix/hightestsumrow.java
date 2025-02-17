package matrix;

public class hightestsumrow {
    public static void main(String[] args) {
        int nums[][] = {{10, 20, 10}, {40, 50, 60}, {70, 80, 90}};
        int row = nums.length, col = nums[0].length;
        int max = 0;
//        for (int i=0;i<row;i++){
//            int sum=0;
//            for (int j=0;j<col;j++){
////                sum = sum+nums[i][j];
//                sum = sum+nums[j][i];
//            }
//            if (sum>max)
//                max=sum;
//        }
//        System.out.println(max);
        int sum2 = 0;
        for (int i = 0; i < row; i++) {
            if (nums[i]!=nums[row-1-i])
                    sum2 = sum2 + nums[i][row-1-i];
                }
        System.out.println(sum2);
    }

}
