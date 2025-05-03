package Recursion;

public class lab5 {
    public static void main(String[] args) {
        int arr[]={2,4,6,8,10,12,14,16,18,20};
        System.out.println(binarysearch(arr,0, arr.length-1,20));
    }
    public static boolean binarysearch(int arr[],int start,int end,int target){
        if (arr.length==0){
            return false;
        }
        int mid=(start+end)/2;
        if (start>end){
            return false;
        }
        if (arr[mid]==target){
            return true;
        }
        else if (arr[mid]>target) {
            return binarysearch(arr,start,mid-1,target);
        }
        else {
            return binarysearch(arr,mid+1,end,target);
        }
    }
}
