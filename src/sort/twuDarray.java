package sort;

public class twuDarray {
    public static void main(String[] args) {
        int a[][]={
                {10, 20, 30},
                {40, 50, 60},
                {70, 80, 90},
        };
        int row=a.length;
        int col=a[0].length;
//        for(int i=0;i<row;i++){
//            for(int j=0;j<col;j++){
//                System.out.print(a[i][j]+" ");
//            }
//            System.out.println();
//        }
        for(int i=row-1;i>=0;i--){
            for(int j=col-1;j>=0;j--){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }

    }
}

