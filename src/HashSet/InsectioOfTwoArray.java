package HashSet;

import java.util.HashSet;

public class InsectioOfTwoArray {
    public static void main(String[] args) {
        HashSet<Integer> set=new HashSet<>();
        HashSet<Integer> set1=new HashSet<>();

        int arr[]={1,2,3,4};
        int arr1[]={3,4,5,6};

        for (int num:arr){
            set.add(num);
        }
        for (int num:arr1){
            if (set.contains(num)){
                set1.add(num);
            }
        }
        System.out.println(set1);
    }
}
