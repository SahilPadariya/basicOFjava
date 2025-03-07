package String;

public class Question14 {
    public static void main(String[] args) {
        String s1="madam eye nitin";
        String s2[]=s1.split(" ");
        for (int i=0;i<s2.length;i++){
            char c[]=s2[i].toCharArray();
            int start=0,end=c.length-1;
            while (start<=end){
                if (c[start]!=c[end]){
                    System.out.println("not palin drome");
                    return;
                }
                start++;
                end--;
            }
        }
        System.out.println("palindrome");
    }
}
