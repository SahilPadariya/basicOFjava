package asignment;

import java.util.Arrays;

public class countsortingserch {
    public static void main(String[] args) {
        int a[]={1,1,1,1};
        int count=0;
//        int count1=0;
        for (int i=0; i<a.length;i++){
            if(a[i]==0){
                count++;
            }
        }
        for (int i=0;i<count;i++){
            a[i]=0;
        }
        for (int i=count;i<a.length;i++){
            a[i]=1;
        }
        System.out.println(Arrays.toString(a));
    }
}
