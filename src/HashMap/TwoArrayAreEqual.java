package HashMap;

import java.util.HashMap;
import java.util.Map;

public class TwoArrayAreEqual {
    public static void main(String[] args) {
        HashMap<Integer,Integer> hashMap=new HashMap<>();

        int arr[]={1,1,2,2,3,3,4,4};
        int arr1[]={1,1,2,2,3,3,4,4};

        if (arr.length != arr1.length){
            System.out.println("Not Equal");
            return;
        }
        for (int i=0;i<arr.length;i++){
            if (!hashMap.containsKey(arr[i])){
                hashMap.put(arr[i],1);
            }else {
                int freq=hashMap.get(arr[i]);
                freq++;
                hashMap.put(arr[i],freq);
            }
        }
        for (int i=0;i<arr1.length;i++){
            if (!hashMap.containsKey(arr[i])){
                System.out.println("Not equal");
                return;
            }else {
                int freq=hashMap.get(arr1[i]);
                freq--;
                hashMap.put(arr1[i],freq);
            }
        }
       for (Map.Entry<Integer,Integer> me:hashMap.entrySet()){
           if (me.getValue() != 0){
               System.out.println("Not Equal");
               return;
           }
       }
        System.out.println("Equal");
    }
}
