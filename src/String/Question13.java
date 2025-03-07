package String;

public class Question13 {
    public static void main(String[] args) {
        String s1="sahil",s2="patel",s3="";
        if (s1.length()==s2.length()){
            for (int i=0;i<s1.length();i++){
                s3=s3+s1.charAt(i);
                s3=s3+s2.charAt(i);
            }
        }
        else {
            System.out.println("both are not same length");
            return;
        }
        System.out.println(s3);
    }
}
