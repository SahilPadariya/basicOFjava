package matrix;

public class leetcode2500 {
    public static void main(String[] args) {
        int grid[][]={{1,2,4},{3,3,1}};
        int m= grid.length;
        int n= grid[0].length;
        int bigV=0;
        int sum=0;
        for (int k=0;k<m;k++) {
            int max2 = 0;
            for (int i = 0; i < m; i++) {
                int max = 0;
                for (int j = 0; j < n - i; j++) {
                    if (grid[i][j] > grid[i][max]) {
                        max = j;
                    }
                }
                if (max2 < grid[i][max]) {
                    max2 = grid[i][max];
                }
                for (int j = max; j < n - 1 - i; j++) {
                    grid[i][j] = grid[i][j + 1];
                }
            }
            bigV += max2;
        }
        System.out.println(bigV);
        for (int s=0;s<m;s++){
            int max3=0;
            for (int v=0;v<n;v++){
                int max=0;
                for (int c=0;c<m;c++){
                    max3= Math.max(max,grid[c][v]);
                }
                sum+=max3;
            }
        }
        System.out.println(sum);
        }
    }
