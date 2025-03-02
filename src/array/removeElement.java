package array;

import java.util.Arrays;
import java.util.HashSet;

public class removeElement {
    public static void main(String[] args) {
        int arr[]={2,1,2,2,3,0,4,2};
//        HashSet<Integer> hs=new HashSet<>();
        int remove=2;
//        int arr1[]=new int[arr.length];
        int index=0;
        for (int i=0;i<arr.length;i++) {
            if (remove != arr[i]) {
                arr[index] = arr[i];
                index++;
//                hs.add(arr[i]);
            }
//            hs.add(arr[i]);

        }
        System.out.println(index);
        System.out.println(Arrays.toString(arr));
//        System.out.println(hs);
    }
}
