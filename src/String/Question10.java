package String;

public class Question10 {
    public static void main(String[] args) {
        String s1="how1 are2 y2ou";
        String s2="";
        int asci='0';
        int asci2='9';
        for (int i=0;i<s1.length();i++){
            int asci3=s1.charAt(i);
            if (asci3>=asci && asci3<=asci2){
                continue;
            }
            else {
                s2 = s2 + s1.charAt(i);
            }
        }
        System.out.println(s2);
    }
}
