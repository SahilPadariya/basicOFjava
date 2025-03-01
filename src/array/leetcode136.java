package array;

public class leetcode136 {
    public static void main(String[] args) {
        int find=0;
        int arr[] = {1,2,3,4,5,4,3,2,1};
            for (int i=0 ; i<arr.length;i++){
                find=find^arr[i];
            }
        System.out.println(find);
        }
    }