package HashSet;

import java.util.HashSet;

public class PrintDistinct {
    public static void main(String[] args) {
        int arr[]={1,2,2,1,4,5,5,4,6,8};
        HashSet<Integer> hashSet=new HashSet<>();
        for (int num:arr){
            hashSet.add(num);
        }
        System.out.println(hashSet);
    }
}

