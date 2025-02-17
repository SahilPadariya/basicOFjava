package array;

import java.util.Arrays;
public class araystoreanothertwoarray {
    public static void main(String[] args) {
        int []a={1,2,3,4,5,6};
        int n=a.length;
        int []a1=new int[n/2];
        int []a2=new int[n/2];
        for (int i=0;i<n/2;i++){
            a1[i]=a[i];
            a2[i]=a[n/2+i];
        }
        System.out.print(Arrays.toString(a1));
        System.out.print(Arrays.toString(a2));
    }
}
