package matrix;

import java.util.Arrays;

public class print_diagonal_ele_topleft_bottomright_squaremaatrix {
    public static void main(String[] args) {
        int nums[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int row = nums.length, col = nums[0].length;
        int index = 0;
        int sum = 0,k= nums.length-1;
//        for (int i=0;i<row;i++){
//            for (int j=0;j<col;j++) {
//                if (nums[i][j] == nums[j][i]) {
//                    System.out.print(nums[i][j]);
//                }
//            }
//                System.out.println();
//        }
//        for (int i=0;i<col;i++){
//               if (nums[i][index]==nums[index][i]) {
//                   System.out.println(nums[i][index]);
//               }
//               index++;
////            }
//        for (int i=0;i<row;i++){
//            System.out.print(nums[i][i]);
//        }
//        System.out.println( );
//        for (int j=0;j<col;j++){
//            System.out.print(nums[j][col-1-j]);
//        }
//        System.out.println();
        for (int i=0;i<row;i++){
            sum+=nums[i][i];
            if (i!=k) {
                sum = sum + nums[i][k];
            }
                k--;
            }
        System.out.println(sum);

    }
    }

