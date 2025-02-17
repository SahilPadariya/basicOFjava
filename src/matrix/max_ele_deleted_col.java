package matrix;

public class max_ele_deleted_col {
    public static void main(String[] args) {
        int nums[][] = {{10, 40, 20}, {30, 20, 10}, {50, 60, 70}};
        int row = nums.length, col = nums[0].length;
        for (int i = 0; i < col; i++) {
            int max = 0;
            for (int j = 1; j < row; j++) {
                if (nums[j][i] > nums[max][i]) {
                    max = j;
                }
            }
            for (int j = max; j < row - 1; j++) {
                nums[j][i] = nums[j+1][i];
            }
        }
        for (int i=0;i<row-1;i++) {
            for (int j=0;j<col;j++){
                System.out.print(nums[i][j]+" ");
            }
            System.out.println();
        }
    }
}
