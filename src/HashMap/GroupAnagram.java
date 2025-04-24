package HashMap;

import java.util.*;

public class GroupAnagram {
    public static void main(String[] args) {
        HashMap<String,ArrayList<String>> map=new HashMap();
        HashSet<ArrayList<String>> set=new HashSet<>();
        String []arr={"eat", "tea", "tan", "ate", "nat", "bat"};

        for (String word:arr){
            char arr1[]=word.toCharArray();
            Arrays.sort(arr1);
            StringBuilder sb=new StringBuilder();
            sb.append(arr1);
            if (!map.containsKey(sb.toString())){
                map.put(sb.toString(),new ArrayList<>());
            }
            map.get(sb.toString()).add(word);
        }
        ArrayList<Integer>ll=new ArrayList<>();
        for (Map.Entry<String,ArrayList<String>> me:map.entrySet()){
            set.add(me.getValue());
        }
        System.out.println(set);
    }
}
