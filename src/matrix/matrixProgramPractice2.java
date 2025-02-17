package matrix;

public class matrixProgramPractice2 {
    public static void main(String[] args) {
        int matrix[][]={{1,2,3},{4,5,6},{7,8,9}};
        int row= matrix.length,col=matrix[0].length;
        System.out.println(row+" "+col);
        System.out.println();
        printMatrix(matrix,row,col);
    }
    private static void printMatrix(int matrix[][],int row,int col) {
        int max4 = 0;
        for (int i = 0; i < col; i++) {
            for (int j = 1; j < row; j++) {
                if (matrix[j][i] > matrix[max4][i]) {
                    max4 = j;
                }
            }
            for (int j = max4; j < row - 1; j++) {
                matrix[j][i] = matrix[j + 1][i];
            }
        }
            for (int i=0;i<row-1;i++) {
                for (int j = 0; j < col; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }
        System.out.println();
        for (int i=0 ; i<row ;i++){
            System.out.print(matrix[i][i]+" ");
        }
        System.out.println();
        for (int j=0 ; j<col;j++){
            System.out.print(matrix[j][col-1-j]+" ");
        }
        System.out.println();
        int k=row-1,sum=0;
        for (int i =0;i<row;i++){
            sum=sum+matrix[i][i];
                if (i!=k){
                    sum=sum+matrix[i][k];
            }
                k--;
        }
        System.out.println(sum);
  }
}
