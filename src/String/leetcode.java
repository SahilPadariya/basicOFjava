package String;

public class leetcode {
    public static void main(String[] args) {
        String s="a1c1e1";
        String s2="1245683";
        int sum=0;
        StringBuilder s1 = new StringBuilder();

        for (int i = 0; i < s.length(); i++){
            if (Character.isDigit(s.charAt(i))) {
                s1.append((char) (s.charAt(i-1) + s.charAt(i)-'0'));
            } else {
                s1.append(s.charAt(i));
            }
        }
        for (int i=0;i<s2.length();i++){
            sum=sum*10+(s2.charAt(i)-'0');
        }
        System.out.println(sum);
        System.out.println(s1.toString());
    }
}
