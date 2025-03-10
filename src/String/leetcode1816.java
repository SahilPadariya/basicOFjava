package String;

public class leetcode1816 {
    public static void main(String[] args) {
        String s="how are you hello sahil";
        String s2="";
        int k=4,count=0;
        for (int i=0;i<s.length();i++){
            if (s.charAt(i)==' '){
                count++;
            }
            if (count==k || i==s.length()-1){
                for (int j=0;j<=i;j++){
                    s2+=s.charAt(j);
                }
                break;
            }
        }

        System.out.println(s2);
    }
}
