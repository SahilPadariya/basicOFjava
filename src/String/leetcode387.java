package String;

public class leetcode387 {
    public static void main(String[] args) {
        String s="loveleetcode";
        int arr[]=new int[128];
        for (int i=0;i<s.length();i++){
            int asci=s.charAt(i);
            arr[asci]=arr[asci]+1;
        }
        for (int i=0;i<s.length();i++){
            int asci=s.charAt(i);
            if (arr[asci]==1){
                System.out.println(i);
                return;
            }
        }
        System.out.println(-1);
    }
}
