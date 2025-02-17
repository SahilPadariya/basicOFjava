package sort;

public class selectionsort {
    public static void main(String[] args) {

    int arr[]={1,3,4,6,2,5};
    int n=arr.length;
    int temp = 0;
    for(int i = 0 ; i<n-1 ; i++) {
        int min = i ;
        for(int j=i+1 ; j<n ; j++) {
            if (arr[j] < arr[min]) {
                min = j;
                temp=arr[min];
                arr[min]=arr[i];
                arr[i]=temp;
            }
        }
//            if(min!=i){
//                temp=arr[min];
//                arr[min]=arr[i];
//                arr[i]=temp;
//            }
        }
    for (int k = 0 ; k<n ; k++){
        System.out.println(arr [k]);
    }
    }
}
