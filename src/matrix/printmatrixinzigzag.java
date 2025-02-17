package matrix;

public class printmatrixinzigzag {
    public static void main(String[] args) {
        int[][] nums = {{1, 2, 3},
                        {4, 5, 6},
                        {7, 8, 9}};
        int row = nums.length, col = nums[0].length;
//        for (int i=0;i<row;i++){
//            if (i%2==0) {
//                for (int j = 0; j < col; j++) {
//                    System.out.print(nums[i][j] + " ");
//                }
//            }
//            else {
//                for (int k=col-1;k>=0;k--){
//                    System.out.print(nums[i][k]+" ");
//            }
//            }
//            System.out.println();
//        }
        for (int s = 0; s < col; s++) {
            if (s % 2 == 1) {
                for (int m = row - 1; m >= 0; m--) {
                    System.out.print(nums[m][s] + " ");
                }
            } else {
                for (int k = 0; k < row; k++) {
                    System.out.print(nums[k][s] + " ");
                }
            }
            System.out.println();
        }
    }
}
