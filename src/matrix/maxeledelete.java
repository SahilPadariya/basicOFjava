package matrix;

public class maxeledelete {
    public static void main(String[] args) {
        int nums[][]={{10,10,10},{70,100,700},{70,70,70}};
        int row=nums.length,col=nums[0].length;
        int max=0;
        for (int i =0; i<row;i++) {
            for (int j = 1; j < col; j++) {
                if (nums[i][j] > nums[i][max]) {
                    max = j;
                }
            }
            for (int j = max; j < col - 1; j++) {
                nums[i][j] = nums[i][j + 1];
            }
            for (int j = 0; j < col - 1; j++) {
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }
    }
}
