package sort;

public class findsecmax {
    public static void main(String[] args) {
        int arr[]={10,7,11,16,18,18,17,5,17};
        int max1= Integer.MIN_VALUE;
        int max2= Integer.MIN_VALUE;
        int max3= Integer.MIN_VALUE;
        for (int i=0;i<arr.length;i++){
            if(arr[i]>max1){
                max3=max2;
                max2=max1;
                max1=arr[i];
            }
            else if (arr[i]>max2 && arr[i] != max1) {
                max3 =  max2;
                max2 = arr[i];
            }
            else if (arr[i]>max3 && arr[i] != max1 && arr[i] != max2) {
                max3 = arr[i];
            }
        }
        System.out.println(max3);
    }
}
