package String;

public class leetocde125 {
    public static void main(String[] args) {
        String s1="A man, a plan, a canal: Panama";
        String s2="";
        s1=s1.toLowerCase();
        int ascia='a',asciz='z';
        for (int i=0;i<s1.length();i++){
            int asci=s1.charAt(i);
            if (ascia<=asci && asci<=asciz){
                s2=s2+s1.charAt(i);
            }
        }
        System.out.println(s2);
//        char arr[]=s2.toCharArray();
        int i=0,j=s2.length()-1;
        while (i<j){
            if (s2.charAt(i)!=s2.charAt(j)){
            System.out.println("false");
                return;
            }
            i++;
            j--;
        }
        System.out.println("true");
    }
}