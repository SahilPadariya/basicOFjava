package array;

import java.util.ArrayList;
import java.util.Arrays;

public class leetcode349 {
    public static void main(String[] args) {
        int n[]={8,0,3};
        int n2[]={0,0};
        Arrays.sort(n);
        Arrays.sort(n2);
        ArrayList<Integer> resul=new ArrayList<>();
        int value=Integer.MIN_VALUE;
        for (int i=0;i<n.length;i++){
            if (value!=n[i]){
                int left=0,right=n2.length-1,mid;
                while (left<=right){
                    mid=left+(right-left)/2;
                    if (n2[mid]==n[i]){
                        resul.add(n[i]);
                        break;
                    }
                    else if (n2[mid]<n[i]){
                        left=mid+1;
                    }else {
                        right=mid-1;
                    }
                }
                value=n[i];
            }
        }
//        System.out.println(resul);
//        int n[]={4,7,9,7,6,7};
//        int n2[]={5,0,0,6,1,6,2,2,4};
//        Arrays.sort(n);
//        Arrays.sort(n2);
//        int pointer=0;
//        for (int i=1; i<n.length; i++){
//            if (n[i]>n[pointer]) {
//                pointer++;
//                n[pointer] = n[i];
//            }
//        }
//        for (int i=0; i<=pointer; i++){
//            int left=0,right=n2.length-1,mid;
//            while (left<=right){
//                mid=left+(right-left)/2;
//                if (n[i]==n2[mid]){
//                    resul.add(n[i]);
//                    break;
//                }
//                else if (n[i]<n2[mid]){
//                    right=mid-1;
//                }
//                else {
//                    left=mid+1;
//                }
//            }
//        }
        int a[]=new int[resul.size()];
        for (int j=0;j<resul.size();j++){
            a[j]=resul.get(j);
        }
        System.out.println(Arrays.toString(a));
    }
}
