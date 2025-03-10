package String;

public class leetcode1662 {
    public static void main(String[] args) {
        String word1[]={"ab","c"};
        String word2[]={"a","bc"};
        String s1=String.join("",word1);
        String s2=String.join("",word2);
        if (s1.length() != s2.length()){
            System.out.println("false");
            return;
        }
        for (int i=0;i<s1.length();i++){
            if (s1.charAt(i) != s2.charAt(i)){
                System.out.println("false");
                return;
            }
        }
        System.out.println("true");
    }
}
