package HashSet;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class PrintUnique {
    public static void main(String[] args) {
        int arr[]={1,2,2,1,3,3,4,5,6,8,8};
//        HashSet<Integer>hashSet=new HashSet<>();
//        HashSet<Integer>dup=new HashSet<>();
//
//        for (int num:arr){
//            if (!hashSet.add(num)){
//                dup.add(num);
//            }
//        }
//        hashSet.removeAll(dup);
//        System.out.println(hashSet);
        HashMap<Integer,Integer>map=new HashMap<>();
        for (int num : arr){
            int freq =map.getOrDefault(num,0);
            freq++;
            map.put(num,freq);
        }
        boolean flag=false;
        for (Map.Entry<Integer,Integer> me :map.entrySet()){
            if (me.getValue()==1){
                System.out.print(me.getKey()+" ");
                flag=true;
            }
        }
        if (flag==false) {
            System.out.println("No uniq");
        }
    }
}
