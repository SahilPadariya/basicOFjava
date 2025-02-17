package sort;

import java.util.Arrays;

public class inserinsortin {
    public static void main(String[] args) {
        int[] a={10,20,30,40,50,0,0,0};
        int p=5;
        int k=25;
        int update=210;
        for (int i=0;i<p;i++){
            if(k<a[i]) {
                int temp = a[i];
                a[i] = k;
                for (int j = i + 1; j <=p; j++) {
                        int temp2 = a[j];
                        a[j] = temp;
                        temp = temp2;
                }
                p++;
                break;
            }
        }
        System.out.println(Arrays.toString(a));
        for (int m=0;m<a.length ;m++){
            if (20==a[m]){
                a[m]=update;
            }
        }
        for (int l=0;l<a.length;l++){
            if (a[k]<a[l]){
                int temp3=a[l+1];
                a[l+1]=a[l];
                a[l]=temp3;
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
