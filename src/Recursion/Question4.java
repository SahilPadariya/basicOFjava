package Recursion;

public class Question4 {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        print(arr,0);
    }
    public static void print(int arr[],int index){
        if (index==arr.length){
            return;
        }
        System.out.print(arr[index]+" ");
        print(arr,index+1);
    }
}
