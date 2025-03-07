package String;

public class Question16 {
    public static void main(String[] args) {
        String s1="hello",s2="";
        int arr[]=new int[128];
        for (int i=0;i<s1.length();i++){
            int asci=s1.charAt(i);
            if (arr[asci]==0){
                arr[asci]=arr[asci]+1;
                s2=s2+s1.charAt(i);
            }
        }
        System.out.println(s2);
    }
}
