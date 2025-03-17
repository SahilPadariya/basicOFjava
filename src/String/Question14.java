package String;

public class Question14 {
    public static void main(String[] args) {
        String s1="madam eye nitin";
        int index=0;
        StringBuilder s3=new StringBuilder();
        s3.append(s1.substring(0,1));
        for (int i=0;i<s1.length();i++){
            if (i==s1.length() || s1.charAt(i)==' '){
                boolean check=ispalindrome(index,i-1,s1);
                if (check==false){
                    System.out.println(check);
                    return;
                }
                index= i+1;
            }
        }
        System.out.println(true);
    }
    public static boolean ispalindrome(int index,int i,String s){
        while (index<i){
            if (s.charAt(index) != s.charAt(i)){
                return false;
            }
            i--;
            index++;
        }
        return true;
    }
}
