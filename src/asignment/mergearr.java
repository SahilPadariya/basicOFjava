package asignment;

import java.lang.reflect.Array;
import java.util.Arrays;

public class mergearr {
    public static void main(String[] args) {
        int a[]={1,9,10,13,20};
        int a2[]={12,18,25,30,50,90,100};
        int n1=a.length,n2=a2.length;
        int n3=n1+n2;
        int a3[]=new int[n3];
        int i=0,j=0,k=0;
        while (i<n1 && j<n2){
            if(a[i]<a2[j]){
                a3[k]=a[i];
                i++;
            }
            else {
                a3[k]=a2[j];
                j++;
            }
            k++;
        }
        while (j<n2){
            a3[k]=a2[j];
            j++;
            k++;
        }
        while (i<n1){
            a3[k]=a[i];
            i++;
            k++;
        }
        System.out.println(Arrays.toString(a3));
    }
}
