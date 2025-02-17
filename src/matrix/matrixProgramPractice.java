package matrix;

public class matrixProgramPractice {
    public static void main(String[] args) {
        int matrix[][]={{1,2,3},{4,5,6},{7,8,9}};
        int row= matrix.length,col=matrix[0].length;
        System.out.println(row+" "+col);
        System.out.println();
        printMatrix(matrix,row,col);
    }
    private static void printMatrix(int matrix[][],int row,int col) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        int find = 5;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (find == matrix[i][j]) {
                    System.out.println("present");
                }
            }
        }
        System.out.println();
        int sum = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                sum = sum + matrix[i][j];
            }
        }
        System.out.println(sum);
        System.out.println();
        for (int i = row - 1; i >= 0; i--) {
            for (int j = col - 1; j >= 0; j--) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < row; i++) {
            for (int j = col - 1; j >= 0; j--) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(matrix[j][i] + " ");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < row; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < col; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
            } else {
                for (int j = col - 1; j >= 0; j--) {
                    System.out.print(matrix[i][j] + " ");
                }
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < col; i++) {
            if (i % 2 == 1) {
                for (int j = row - 1; j >= 0; j--) {
                    System.out.print(matrix[j][i] + " ");
                }
            } else {
                for (int j = 0; j < row; j++) {
                    System.out.print(matrix[j][i] + " ");
                }
            }
            System.out.println();
        }
        System.out.println();
        int max=0;
        for (int i = 0; i < row; i++) {
            int sum2 = 0;
            for (int j = 0; j < col; j++) {
                sum2 = sum2 + matrix[i][j];
            }
            if (max<sum2){
                max=sum2;
            }
        }
        System.out.println(max);
        System.out.println();
        int max2=0;
        for (int i = 0; i < col; i++) {
            int sum2 = 0;
            for (int j = 0; j < row; j++) {
                sum2 = sum2 + matrix[j][i];
            }
            if (max2<sum2){
                max2=sum2;
            }
        }
        System.out.println(max2);
        System.out.println();
        int max3=0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (matrix[i][j]>matrix[i][max3]){
                    max3=j;
                }
            }
            for (int j=max3;j<col-1;j++){
                matrix[i][j]=matrix[i][j+1];
            }
            for (int j=0;j<col-1;j++){
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }
}
