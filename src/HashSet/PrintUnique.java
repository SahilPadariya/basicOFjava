package HashSet;

import java.util.HashSet;

public class PrintUnique {
    public static void main(String[] args) {
        int arr[]={1,2,2,1,3,3,4,5,6,8,8};
        HashSet<Integer>hashSet=new HashSet<>();
        HashSet<Integer>dup=new HashSet<>();

        for (int num:arr){
            if (!hashSet.add(num)){
                dup.add(num);
            }
        }
        hashSet.removeAll(dup);
        System.out.println(hashSet);
    }
}
