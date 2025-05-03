package Recursion;

public class lab2 {
    public static void main(String[] args) {
        String s="patel sahil";
        StringBuilder ans=new StringBuilder();
        s=(reverse(s,s.length()-1,ans));
        System.out.println(s);
    }
    public static String reverse(String str,int index,StringBuilder ans){
        if (index==-1){
            return ans.toString();
        }
        return reverse(str,index-1,ans.append(str.charAt(index)));
    }
}
