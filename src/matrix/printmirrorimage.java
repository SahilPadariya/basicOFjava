package matrix;

public class printmirrorimage {
    public static void main(String[] args) {
        int [][]nums={{10,20,30},{40,50,60},{70,80,90}};
        int col=nums.length,row=nums[0].length;
        for (int i=0;i<col;i++){
            for (int j=row-1;j>=0;j--){
                System.out.print(nums[i][j]+" ");
            }
            System.out.println();
        }
    }
}
