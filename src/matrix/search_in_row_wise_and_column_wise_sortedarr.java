package matrix;

public class search_in_row_wise_and_column_wise_sortedarr {
    public static void main(String[] args) {
     int nums[][]={{2,16,26},{5,18,29},{10,20,33},{15,25,40}};
     int row=nums.length,col=nums[0].length;
     int i=0,j=col-1;
     int target=50;
     while (i<row  && j>=0){
         if (target==nums[i][j]){
             System.out.println("present");
             return;
         } else if (target>nums[i][j]) {
             i++;
         }
         else {
             j--;
         }
     }
        System.out.println("not present");
    }
}