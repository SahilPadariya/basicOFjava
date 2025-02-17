package matrix;

public class find_sortarr_matrix_log_c_into_row {
    public static void main(String[] args) {
        int matrix[][] = {{2, 5, 9, 10}, {16, 18, 23, 28}, {30, 32, 33, 39}, {45, 46, 50, 58}};
        int row = matrix.length, col = matrix[0].length;
        int target = 46;
        //row.log column
//        for (int i=0 ;i<row ;i++){
//            int left = 0, right = col- 1;
//            while (left<=right){
//                    int mid=(left+right)/2;
//                    if (target==matrix[i][mid]){
//                        System.out.println("present");
//                        return;
//                    }
//                    else if(target>matrix[i][mid]){
//                        left=mid+1;
//                    }
//                    else {
//                        right=mid-1;
//                    }
//                }
//            }
        //column.log row
        for (int i=0 ;i<col ;i++){
            int left = 0, right = row-1;
            while (left<=right){
                int mid=(left+right)/2;
                if (target==matrix[i][mid]){
                    System.out.println("present");
                    return;
                }
                else if(target>matrix[i][mid]){
                    left=mid+1;
                }
                else {
                    right=mid-1;
                }
            }
        }
        System.out.println("not present");
    }
}
