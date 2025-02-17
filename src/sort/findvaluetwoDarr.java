package sort;

public class findvaluetwoDarr {
    public static void main(String[] args) {
        int a[][]={
                {10, 20, 30},
                {40, 50, 60},
                {70, 80, 90}
        };
        int find=80;
        int sum=0;
        int row=a.length;
        int col=a[0].length;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(find==a[i][j]) {
                    System.out.println("present");
                }
                sum+=a[i][j];
            }
        }
        System.out.println(sum);
        System.out.println(a.length);
        System.out.println(a[0].length);
    }
}
