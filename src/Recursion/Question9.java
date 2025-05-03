package Recursion;

public class Question9 {
    public static void main(String[] args) {
        int arr[]={100,50,50,60,40,80};
        System.out.println(largest(arr,0,0));
    }
    public static int largest(int arr[],int index,int max){
        if (index==arr.length){
            return max;
        }
        if (arr[index]>max){
            max=arr[index];
        }
        return  largest(arr,index+1,max);
    }
}
