package String;

public class leetcode2185 {
    public static void main(String[] args) {
        String words[]={"pay","attentiton","practice","attend"};
        String pref="at";
        int count = 0;
        for (int i = 0; i < words.length; i++) {
            if (words[i] == "") {
                continue;
            } else if (words[i].length() >= pref.length()) {
                if (words[i].charAt(0) == pref.charAt(0) && words[i].charAt(1) == pref.charAt(1)) {
                    count++;
                }
                words[i].startsWith(pref);
                continue;
            } else {
                continue;
            }
        }
        System.out.println(count);
    }
}
