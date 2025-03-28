package String;

public class leetcode345 {
    public static void main(String[] args) {
        String s = "Euston saw I was not Sue.";
        StringBuilder ans = new StringBuilder(s);
        int start = 0, end = ans.length() - 1;
        while (start < end) {
            char ch1 = ans.charAt(start);
            char ch2 = ans.charAt(end);

            ch1 = Character.toLowerCase(ch1);
            ch2 = Character.toLowerCase(ch2);

            if (ch1 == 'a' || ch1 == 'e' || ch1 == 'i' || ch1 == 'o' || ch1 == 'u'){
                if (ch2 == 'a' || ch2 == 'e' || ch2 == 'i' || ch2 == 'o' || ch2 == 'u'){
                    ans.setCharAt(start, s.charAt(end));
                    ans.setCharAt(end, s.charAt(start));
                    start++;
                    end--;
                }
                else {
                    end--;
                }
            } else if (ch1 != 'a' || ch1 != 'e' || ch1 != 'i' || ch1 != 'o' || ch1 != 'u') {
                start++;
            } else if (ch2 != 'a' || ch2 != 'e' || ch2 != 'i' || ch2 != 'o' || ch2 != 'u') {
                end--;
            }
        }
        System.out.println(ans.toString());
    }
}
