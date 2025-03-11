package String;

public class Question11 {
    public static void main(String[] args) {
        String s1 = "good evening";
        StringBuilder s2 = new StringBuilder();
        int index = 0;
        for (int i = 0; i < s1.length(); i++) {
            if (i==s1.length() || s1.charAt(i) == ' ') {
                s2.append(reverse(index, i - 1, s1));
                if (i<s1.length()){
                    s2.append(" ");
                }
                index=i+1;
            }
        }
        System.out.println(s2);
    }
    public static String reverse(int start,int end,String s){
        char arr[]=s.toCharArray();
        while (start<end){
            char temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        String s2=new String(arr);
        return s2;
    }
}