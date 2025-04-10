package matrix;

public class Prectice {
    public static void main(String[] args) {
        int [][] arr = {{1,2,3},
                        {4,5,6},
                        {7,8,9}};
        int row=arr.length;
        int col=arr[0].length;

        for (int i=row-1;i>=0;i--){
            for (int j=col-1;j>=0;j--){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
