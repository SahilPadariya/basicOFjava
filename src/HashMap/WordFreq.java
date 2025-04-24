package HashMap;

import java.util.HashMap;
import java.util.Map;

public class WordFreq {
    public static void main(String[] args) {
        String s = "Java is great. Java is fastf";

        HashMap<String, Integer> hashMap = new HashMap<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            // If character is alphabetic, add to word
            if (Character.isLetter(ch)) {
                sb.append(ch); // optional: make lowercase
            }

            // If non-alphabetic OR last character, finalize the word
            if (!Character.isLetter(ch) || i == s.length() - 1) {
                if (sb.length() > 0) {
                    String word = sb.toString();
                    hashMap.put(word, hashMap.getOrDefault(word, 0) + 1);
                    sb.setLength(0); // clear the StringBuilder
                }
            }
        }
            for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
                System.out.println(entry.getKey() + " : " + entry.getValue());
            }
        }
    }

