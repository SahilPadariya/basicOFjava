package HashMap;

import java.util.*;

public class Q4GroupStringsbyLength {
    public static void main(String[] args) {
        String arr[]= {"hi", "hello", "hey", "welcome","how"};
        HashMap<Integer, ArrayList<String>> map=new HashMap<>();

        for (String word:arr){
            int lan=word.length();
            if (map.containsKey(lan)){
                ArrayList<String> alt=map.get(lan);
                map.put(lan,alt);
            }else {
                ArrayList<String>alt=new ArrayList<>();
                alt.add(word);
                map.put(lan,alt);
            }
            //2.second method
//                map.get(lan).add(word);
        }
        for (Map.Entry me:map.entrySet()){
            System.out.println(me);
        }
    }
}
