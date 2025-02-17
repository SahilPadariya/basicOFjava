package asignment;

import java.util.Arrays;

public class rotedbyposition {
    public static void main(String[] args) {
        int []a={1,2,3,4,5,6};
//        int []a1=new int[a.length];
        int k=2%a.length;
//        int index=0;
        for (int j=1 ; j<=k; j++) {
//            a1[index] = a[j];
//            index++;
            int temp = a[0];
            for (int i = 0; i < a.length-1; i++) {
//                a1[index] = a[i];
//                index++;
                a[i]=a[i+1];
            }
            a[a.length-1]=temp;
        }
        System.out.println(Arrays.toString(a));
    }
}
