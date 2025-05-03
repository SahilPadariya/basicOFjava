package Recursion;

public class lab4 {
    public static void main(String[] args) {
        int arr[]={};
        System.out.println(checksorted(arr,0));
    }
    public static boolean checksorted(int arr[],int index){
        if (arr.length==0){
            return false;
        }
        if (arr.length-1==index){
            return true;
        }
        if (arr[index]>arr[index+1]){
            return false;
        }
        return checksorted(arr,index+1);
    }
}
