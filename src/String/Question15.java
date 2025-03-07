package String;

public class Question15 {
    public static void main(String[] args) {
        String s1="Hello12345";
        int charcount=0,numcount=0;
        int asci1='9';
        for (int i=0;i<s1.length();i++){
            if (s1.charAt(i)>asci1){
                charcount++;
            } else if (asci1>=s1.charAt(i)) {
                numcount++;
            }
        }
        if (charcount==numcount){
            System.out.println("Both Are Equals");
        }
        else {
            System.out.println("both are not equal");
        }
    }
}
