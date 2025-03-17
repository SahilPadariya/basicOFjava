package String;

public class leetcode8 {
    public static void main(String[] args) {
        String s = "0-1";
        int num = 0;
        s.trim();
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '-') {
                if (i>0 && s.charAt(i-1)=='0') {
                    System.out.println("0");
                    return;
                }
                str.append(s.charAt(i));
                continue;
            }
            if (s.charAt(i) < '0') {
                continue;
            }
            if (s.charAt(i) >= 'A' && s.charAt(i) <= 'z') {
                break;
            }
            if (s.charAt(i) >= '1' && s.charAt(i) <= '9') {
                str.append(s.charAt(i));
            }
        }
        if (str.isEmpty()) {
            System.out.println("0");
            return;
        }
        num = Integer.parseInt(str.toString());
        System.out.println(num);
    }
}
