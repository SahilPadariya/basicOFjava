package HashMap;

import java.util.HashMap;
import java.util.Map;

public class CounFreqEachNum {
    public static void main(String[] args) {
        HashMap<Integer,Integer>hashMap=new HashMap<>();
        int arr[]={1,2,2,4,4,3,5,6,2,3,3,4,3};
        for (int num:arr){
            if (!hashMap.containsKey(num)){
                hashMap.put(num,1);
            }
            else {
                int freq=hashMap.get(num);
                freq++;
                hashMap.put(num,freq);
            }
        }
        for (Map.Entry me :hashMap.entrySet()){
            System.out.println(me);
        }
    }
}
