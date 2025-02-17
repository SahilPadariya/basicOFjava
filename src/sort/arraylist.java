package sort;

import java.util.ArrayList;
import java.util.Arrays;

public class arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        //add
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);
        arrayList.add(40);
        arrayList.add(50);
        System.out.println(arrayList);
        //del-remove
        arrayList.remove(4);
        System.out.println(arrayList);
        //index maa add
        arrayList.add(1, 60);
        System.out.println(arrayList);
    }
}