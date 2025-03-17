package String;

public class Question18 {
    public static void main(String[] args) {
        String s1="aabb",s2="bbaa";
        if (s1.length() != s2.length()) {
            System.out.println("not permuting");
            return;
        }
        int a1[]=new int[128];

        for (int i=0;i<s1.length();i++){
            a1[s1.charAt(i)]++;
            a1[s2.charAt(i)]--;
        }
        for (int i=0;i<a1.length;i++){
            if (a1[i]>0){
                System.out.println("not");
                return;
            }
        }
        System.out.println("permuting");
    }
}
