package String;

public class StringPractice {
    public static void main(String[] args) {
        String s1 = "madam eye nitin",s="";
        int index = 0,index1=0;
        boolean flag=true;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) == ' ') {
                s=s+reverce(i - 1, index, s1)+" ";
                index=i+1;
            }
        }
        s=s+reverce(s1.length()-1,index,s1);
        System.out.println(s);

        //cheak palindrome

        for (int i=0;i<s1.length();i++){
            if (s1.charAt(i)==' '){
                if (!cheak(i-1,index1,s1)) {
                    flag = false;
                    System.out.println(flag);
                    return;
                }
                index1=i+1;
            }
        }
        if (!cheak(s1.length()-1,index1,s1)) {
            flag = false;
        }
        System.out.println(flag);

    }
    public static String reverce(int i, int index, String s) {
        String s2 = "";
        while (i >= index) {
            s2 = s2 + s.charAt(i);
            i--;
        }
        return s2;
    }
    public static boolean cheak(int i,int index,String s){
        while (index<i){
            if (s.charAt(index)!=s.charAt(i)){
                return false;
            }
            i--;
            index++;
        }
        return true;
    }
}