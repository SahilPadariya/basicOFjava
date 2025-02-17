package sort;

import java.util.IllegalFormatCodePointException;

public class bublesort {
    public static void main(String[] args) {
        int []arr={6,2,3,4,5,1};
        int n=arr.length;
        int temp = 0 ;
        for(int i=0 ; i<n; i++){
            boolean istemp = false;
            for(int j=0 ; j<n-i-1 ; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                    istemp = true;
                }
            }
                if (!istemp){
                    System.out.println("Already Short");
                    return;
                }

        }
        for (int k = 0 ; k<n ; k++){
            System.out.print(arr[k] +" ");
        }
    }
}
