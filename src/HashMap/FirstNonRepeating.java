package HashMap;

import java.util.HashMap;

public class FirstNonRepeating {
    public static void main(String[] args) {
        HashMap<Character,Integer> map=new HashMap<>();
        String sb="abcdde";

        for (int i=0;i<sb.length();i++){
            char ch=sb.charAt(i);
            if (!map.containsKey(ch)){
                map.put(ch,1);
            }
            else {
                int freq=map.get(ch);
                freq++;
                map.put(ch,freq);
            }
        }
        for (int i=0;i<sb.length();i++){
            char ch=sb.charAt(i);
            int nonrepe=map.get(ch);
            if (nonrepe==1){
                System.out.println(ch);
                return;
            }
        }
        System.out.println("All Character Are Repeating");
    }
}
