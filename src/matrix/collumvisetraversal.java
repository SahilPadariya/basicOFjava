package matrix;

public class collumvisetraversal {
    public static void main(String[] args) {
        int [][]nums={{10,20,30},{40,50,60},{70,80,90}};
        int row=nums.length,col=nums[0].length;
        for (int i=0;i<col;i++){
            for (int j=0;j<row;j++){
                System.out.print(nums[j][i]+" ");
            }
            System.out.println();
        }
    }
}
