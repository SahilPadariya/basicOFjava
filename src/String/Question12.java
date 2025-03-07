package String;

public class Question12 {
    public static void main(String[] args) {
        String s1="helloo";
        int arr[]=new int[128];
        for (int i=0;i<s1.length();i++){
            int asci=s1.charAt(i);
            arr[asci]=arr[asci]+1;
        }
        for (int i=0;i<arr.length;i++){
            if (arr[i]>1){
                System.out.println((char)i);
            }
        }
    }
}
