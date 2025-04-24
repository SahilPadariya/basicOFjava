package HashSet;

import java.util.HashSet;

public class SubSetOrNot {
    public static void main(String[] args) {
        int arr1[]={10,20,4,5,8,4,90,410,2,90,4,20};
        int arr2[]={10};

        HashSet<Integer>hashSet=new HashSet<>();
        for (int num : arr1){
            hashSet.add(num);
        }
        for (int num : arr2){
            if (!hashSet.contains(num)){
                System.out.println("Not Subset");
                return;
            }
        }
        System.out.println("SubSet");
    }
}
