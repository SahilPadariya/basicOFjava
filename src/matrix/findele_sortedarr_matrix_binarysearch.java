package matrix;
import java.io.FileOutputStream;
public class findele_sortedarr_matrix_binarysearch {
    public static void main(String[] args) {
            int matrix[][]={{2,5,9,10},{16,18,23,28},{30,32,33,39},{45,46,50,58}};
            int row= matrix.length,col= matrix[0].length;
            int target=10;
            int left=0,right=row-1;
                    while (left<=right){
                        int mid=(right+left)/2;
                if (target>=matrix[mid][left] && target<=matrix[mid][col-1]){
                    int i=0,j=col-1;
                while (i<=j){
                    int mid2=i+(j-i)/2;
                    if (target==matrix[mid][mid2]){
                        System.out.println("present");
                        return;
                    }
                    else if (target<matrix[mid][mid2]){
                        j=mid2-1;
                    }else {
                        i=mid2+1;
                    }
                }
                    System.out.println("not present");
                    return;
                }
            else if (target<matrix[mid][0]){
                right=mid-1;
            }
            else {
                left=mid+1;
            }
            }
        System.out.println("not");
    }
}
